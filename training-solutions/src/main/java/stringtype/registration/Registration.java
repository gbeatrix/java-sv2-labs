package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg a felhasználónevet: ");
        String user = scanner.nextLine();
        System.out.print("Add meg a jelszót: ");
        String pass1 = scanner.nextLine();
        System.out.print("Add meg a jelszót még egyszer: ");
        String pass2 = scanner.nextLine();
        System.out.print("Add meg az email címet: ");
        String email = scanner.nextLine();

        UserValidator reg = new UserValidator();
        System.out.println("A megadott felhasználónév " + (reg.isValidUsername(user)?"helyes":"helytelen"));
        System.out.println("A megadott jelszó " + (reg.isValidPassword(pass1, pass2)?"helyes":"helytelen"));
        System.out.println("A megadott email cím " + (reg.isValidEmail(email)?"helyes":"helytelen"));
    }
}
