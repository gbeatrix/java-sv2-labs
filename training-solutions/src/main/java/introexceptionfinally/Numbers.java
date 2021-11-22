package introexceptionfinally;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = 1;
        do {
            System.out.print("Kérek egy számot: ");
            try {
                k = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException err) {
                throw new IllegalArgumentException("Nem szám.", err);
            } finally {
                System.out.println("End of round.");
            }
        } while (k % 2 != 0);
    }
}
