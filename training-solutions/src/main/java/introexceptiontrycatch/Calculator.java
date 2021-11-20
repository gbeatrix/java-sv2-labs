package introexceptiontrycatch;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        String op;

        System.out.print("Kérem az első számot: ");
        try {
            a = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException err) {
            System.out.println("ERROR: " + err.getMessage());
            System.out.println("Az első számot 0-ra állítom.");
        }

        System.out.print("Kérem a második számot: ");
        try {
            b = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException err) {
            System.out.println("ERROR: " + err.getMessage());
            System.out.println("A második számot 0-ra állítom.");
        }

        do {
            System.out.print("Kérem az elvégzendő műveletet (+,-,*,/): ");
            op = scanner.nextLine();
        } while(op.length()!=1 || !"+-*/".contains(op));

        try {
            switch (op) {
                case "+":
                    c = a + b;
                    break;
                case "-":
                    c = a - b;
                    break;
                case "*":
                    c = a * b;
                    break;
                case "/":
                    c = a / b;
                    break;
            }
            System.out.println(a + " " + op + " " + b + " = " + c);
        } catch (ArithmeticException err) {
            System.out.println("Hiba: A 0-val osztás nem értelmezett.");
        }
    }
}
