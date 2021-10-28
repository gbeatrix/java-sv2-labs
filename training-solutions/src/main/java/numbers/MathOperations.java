package numbers;

import java.util.Scanner;

public class MathOperations {
    private static final double DELTA = 0.0001;

    private boolean equals(double a, double b){
        return Math.abs(a-b) < DELTA;
    }

    public static void main(String[] args) {
        System.out.println("Oldd meg az alábbi feladatot!");
        System.out.println("2*8-15.158+9/2");
        double result = 2*8-15.158+9/2.;
        double answer = new Scanner(System.in).nextDouble();
        if(new MathOperations().equals(result, answer)){
            System.out.println("helyes megoldás");
        } else {
            System.out.println("nem talált");
        }
    }
}
