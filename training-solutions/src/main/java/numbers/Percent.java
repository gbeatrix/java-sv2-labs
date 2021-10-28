package numbers;

import java.util.Scanner;

public class Percent {
    public double getValue(int a, int b){
        return 1e-2*a*b;
    }

    public double getBase(int a, int b){
        return 100d*a/b;
    }

    public double getPercent(int a, int b){
        return 100.*b/a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Percent percent = new Percent();

        System.out.println("getValue() paraméterei:");
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.println("a*b/100: " + percent.getValue(a, b));

        System.out.println("getBase() paraméterei:");
        System.out.print("a: ");
        a = scanner.nextInt();
        System.out.print("b: ");
        b = scanner.nextInt();
        System.out.println("a/b*100: " + percent.getBase(a, b));

        System.out.println("getPercent() paraméterei:");
        System.out.print("a: ");
        a = scanner.nextInt();
        System.out.print("b: ");
        b = scanner.nextInt();
        System.out.println("b/a*100: " + percent.getPercent(a, b));
    }
}
