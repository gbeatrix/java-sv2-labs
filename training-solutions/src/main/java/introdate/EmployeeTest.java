package introdate;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg az alkalmazott nevét: ");
        String name = scanner.nextLine();
        System.out.print("Add meg az alkalmazott születési dátumát: (ÉÉÉÉ HH NN) ");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        Employee employee = new Employee(year, month, day, name);
        System.out.println("név: " + employee.getName());
        System.out.println("szül.: " + employee.getDateOfBirth());
        System.out.println("belépés: " + employee.getBeginEmployment());

        employee.setName("Gipsz Jakab");
        System.out.println("név: " + employee.getName());
    }
}
