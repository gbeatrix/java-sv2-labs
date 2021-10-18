package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Egy egész számot kérek: ");
        int num = scanner.nextInt();

        System.out.println("A szám osztható 3-mal: " + ((num%3==0)?"igen":"nem"));
    }
}
