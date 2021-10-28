package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exam exam = new Exam();

        System.out.println("Vizsgajelentkezések regisztrálása");
        for (int i = 0; i < 1; i++) {
            System.out.print("név: ");
            String name = scanner.nextLine();
            System.out.print("születési idő - év: ");
            String yearString = scanner.nextLine();
            int year = Integer.parseInt(yearString);
            System.out.print("születési idő - hónap: ");
            String monthString = scanner.nextLine();
            int month = Integer.parseInt(monthString);
            System.out.print("születési idő - nap: ");
            String dayString = scanner.nextLine();
            int day = Integer.parseInt(dayString);
            LocalDate birthDate = LocalDate.of(year, month, day);
            System.out.print("irányítószám: ");
            String zipCodeString = scanner.nextLine();
            int zipCode = Integer.parseInt(zipCodeString);
            System.out.print("osztályzatok átlaga: ");
            String avgString = scanner.nextLine();
            double avg = Double.parseDouble(avgString);

            exam.addPerson(new Person(name, birthDate, zipCode, avg));
        }
        System.out.println(exam.getExaminees());
    }
}
