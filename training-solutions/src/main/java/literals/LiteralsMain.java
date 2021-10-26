package literals;

public class LiteralsMain {
    public static void main(String[] args) {
        System.out.println("" + 1 + 2);
        System.out.println(Integer.toString(1) + 2);

        double quotient = 3/4; // 3/4 maradékos osztás, eredménye 0, majd ez automatikus konverzióval lesz 0.0 lebegőpontos érték
        System.out.println(quotient);
        // legalább az egyik tényezőt lebegőpontos szám literálként megadva már a várt 0.75 eredményt kapjuk
        quotient = 3/4d;
        System.out.println(quotient);
        quotient = 3./4;
        System.out.println(quotient);
        quotient = 3e0/4;
        System.out.println(quotient);

        long big = 3_244_444_444L;
        System.out.println(big);

        String word = "title".toUpperCase();
        System.out.println(word);

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));
    }
}
