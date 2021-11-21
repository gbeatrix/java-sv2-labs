package introexceptionthrow;

import java.util.Scanner;

public class Registration {
    void register() {
        Scanner scanner = new Scanner(System.in);
        Validation validation = new Validation();
        boolean good = true;
        System.out.println("Üdvözöllek!");

        System.out.print("Kérlek, add meg a neved: ");
        String name = scanner.nextLine();
        try {
            validation.validateName(name);
        } catch (IllegalArgumentException err) {
            System.out.println(err.getMessage());
            good = false;
        }

        System.out.print("Kérem a korod: ");
        String ageString = scanner.nextLine();
        try {
            validation.validateAge(ageString);
        } catch (IllegalArgumentException err) {
            System.out.println(err.getMessage());
            good = false;
        }

        System.out.println("A regisztráció során megadott adatok:");
        System.out.println("név: " + name);
        System.out.println("kor: " + ageString);

        if (good) {
            System.out.println("A regisztráció sikeres.");
        } else {
            System.out.println("A regisztráció nem sikerült.");
        }
    }

    public static void main(String[] args) {
        new Registration().register();
    }
}
