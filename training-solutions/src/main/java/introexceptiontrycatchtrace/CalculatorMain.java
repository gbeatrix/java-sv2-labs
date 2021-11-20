package introexceptiontrycatchtrace;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        String op;

        System.out.print("Kérem az első számot: ");
        try {
            a = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException err) {
            System.out.println("Hiba: " + err.getMessage());
            System.out.println("Az első számot 0-ra állítom.");
        }

        System.out.print("Kérem a második számot: ");
        try {
            b = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException err) {
            System.out.println("Hiba: " + err.getMessage());
            System.out.println("A második számot 0-ra állítom.");
        }

        System.out.print("Kérem az elvégzendő műveletet (+,-,*,/): ");
        op = scanner.nextLine();

        String format = "A művelet eredménye: %d\n";

        try {
            switch (op) {
                case "+":
                    System.out.printf(format, new Calculator().add(a, b));
                    break;
                case "-":
                    System.out.printf(format, new Calculator().subtract(a, b));
                    break;
                case "*":
                    System.out.printf(format, new Calculator().multiply(a, b));
                    break;
                case "/":
                    System.out.printf(format, new Calculator().divide(a, b));
                    break;
                default:
                    System.out.println("Ismeretlen művelet.");
            }
        } catch (ArithmeticException err) {
            System.out.println("Hiba: A 0-val osztás nem értelmezett.");
        }
    }
}
