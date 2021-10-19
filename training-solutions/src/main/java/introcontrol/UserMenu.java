package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        System.out.println("1. Felhasználók listázása\n" +
                "2. Felhasználó felvétele\n" +
                "Többi: Kilépés");

        Scanner scanner = new Scanner(System.in);
        int task = scanner.nextInt();

        if(task == 1){
            System.out.println("Felhasználók listázása");
        }

        if(task == 2){
            System.out.println("Felhasználó felvétele");
        }
    }
}
