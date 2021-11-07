package controliteration.division;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.");
        int num = scanner.nextInt();
        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int div = scanner.nextInt();

        for (int i = div; i < num; i += div) {
            System.out.print(i + ", ");
        }
        System.out.println();

        int k = 0;
        while(++k < num){
            if(k%div == 0){
                System.out.print(k + ", ");
            }
        }
    }
}
