package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg az ügyfél nevét: ");
        client.name = scanner.nextLine();
        System.out.print("Add meg a születési évét: ");
        client.year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Add meg az ügyfél címét: ");
        client.address = scanner.nextLine();

        System.out.println("név: " + client.name);
        System.out.println("szül. év: " + client.year);
        System.out.println("cím: " + client.address);
    }
}
