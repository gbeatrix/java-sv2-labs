package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("név: ");
        String name = scanner.nextLine();
        System.out.print("film: ");
        String title = scanner.nextLine();
        System.out.print("jegyek száma: ");
        int numberOfTickets = scanner.nextInt();
        scanner.nextLine();
        System.out.print("választott sor: ");
        int row = scanner.nextInt();
        scanner.nextLine();

        System.out.println(new Cinema().response(name, title, numberOfTickets, row));
    }

    private String response(String name, String title, int numberOfTickets, int row) {
        StringBuilder sb = new StringBuilder();
        sb.append("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők:\n");
        sb.append("Vásárló neve: ").append(name).append("\n");
        sb.append("Film címe: ").append(title).append("\n");
        sb.append("Lefoglalt helyek: ");
        String[] seats = new String[numberOfTickets];
        for (int i = 1; i <= numberOfTickets; i++) {
            seats[i-1] = String.format("%d. sor %d. szék", row, i);
        }
        sb.append(String.join(", ", seats)).append("\n");
        sb.append("Jó szórakozást!");
        return sb.toString();
    }
}
