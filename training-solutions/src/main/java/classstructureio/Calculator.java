package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg az első számot: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Add meg a második számot: ");
        int b = scanner.nextInt();
        scanner.nextLine();

        System.out.print(a);
        System.out.println(" + " + b);
        System.out.println(a+b);
    }
}
