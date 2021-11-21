package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérek egy legfeljebb 5 betűs szót: ");
        String word = scanner.nextLine();

        if (word.length() > 5) {
            throw new IllegalArgumentException("Túl hosszú a megadott szöveg.");
        }

        for (int i = 0; i < word.length(); i++) {
            if (!Character.isAlphabetic(word.charAt(i))) {
                throw new IllegalArgumentException("Tiltott karaktert tartalmaz a megadott szöveg.");
            }
        }

        System.out.println("A megadott szó: " + word);
    }
}
