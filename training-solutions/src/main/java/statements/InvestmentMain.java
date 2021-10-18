package statements;

import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Befektetés összege: ");
        int fund = scanner.nextInt();
        System.out.print("Kamatláb: ");
        int rate = scanner.nextInt();

        Investment investment = new Investment(fund, rate);

        System.out.println("Tőke: " + investment.getFund());
        System.out.println("Hozam 50 napra: " + investment.getYield(50));
        System.out.println("Kivett összeg 80 nap után: " + investment.close(80));
        System.out.println("Kivett összeg 90 nap után: " + investment.close(90));
    }
}
