package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg a neved: ");
        String nev = scanner.nextLine();
        System.out.print("Add meg az email címed: ");
        String email = scanner.nextLine();

        System.out.println("Sikeresen regisztráltál az alábbi adatokkal.");
        System.out.println("név: " + nev);
        System.out.println("email: " + email);
    }
}
