package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {
    public String fullname(String firstname, String lastname){
        return lastname+" "+firstname;
    }

    public LocalDate date(int year, int month, int day){
        return LocalDate.of(year, month, day);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add meg a vezetékneved: ");
        String lastname = scanner.nextLine();
        System.out.print("Add meg a keresztneved: ");
        String firstname = scanner.nextLine();
        System.out.print("Add meg a születési évedet: ");
        int year = scanner.nextInt();
        System.out.print("Add meg a születési hónapodat: ");
        int month = scanner.nextInt();
        System.out.print("Add meg a születési napodat: ");
        int day = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Add meg az email címedet: ");
        String email = scanner.nextLine();

        Registration registration = new Registration();
        Person person = new Person(
                registration.fullname(firstname, lastname),
                registration.date(year, month, day),
                email);
        System.out.println("Sikeres regisztráció!");
        System.out.println(person);
    }
}
