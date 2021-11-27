package algorithmscount;

public class Digits {
    public int getCountOfNumbers() {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            int a = i / 10;
            int b = i % 10;
            if (Math.abs(a - b) == 5) {
                ++count;
            }
        }
        return count;
    }
}
