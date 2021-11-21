package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérek egy pozitív számot: ");
        int k;
        try {
            k = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException err) {
            throw new IllegalArgumentException("Nem számot adtál meg!");
        }
        if (k <= 0) {
            throw new IllegalArgumentException("Nem pozitív számot adtál meg!");
        }
    }
}
