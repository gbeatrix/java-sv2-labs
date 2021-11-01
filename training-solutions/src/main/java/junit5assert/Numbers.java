package junit5assert;

public class Numbers {
    int[] getEvenNumbers(int[] numbers){
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i]%2==0?numbers[i]:0;
        }
        return result;
    }
}
