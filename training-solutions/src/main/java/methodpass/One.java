package methodpass;

public class One {
    public static void main(String[] args) {
        int number = 2021;
        System.out.println(number);
        number += 1;
        System.out.println(number);
        int result = new One().addOne(number);
        System.out.println(result);
        System.out.println(number);
    }

    public int addOne(int number) {
        ++number;
        return number;
    }
}
