package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg a számlaszámot: ");
        String accnum = scanner.nextLine();
        System.out.print("Add meg a nevet: ");
        String name = scanner.nextLine();
        System.out.print("Add meg a nyitóösszeget: ");
        int balance = scanner.nextInt();
        scanner.nextLine();

        BankAccount account = new BankAccount(accnum, name, balance);
        System.out.println(account.getInfo());

        System.out.print("Mennyit szeretnél befizetni: ");
        account.deposit(scanner.nextInt());
        scanner.nextLine();
        System.out.println(account.getInfo());

        System.out.print("Mekkora összeget szeretnél felvenni: ");
        account.withdraw(scanner.nextInt());
        scanner.nextLine();
        System.out.println(account.getInfo());
    }
}
