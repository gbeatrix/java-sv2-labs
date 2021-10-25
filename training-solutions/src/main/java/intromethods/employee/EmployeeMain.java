package intromethods.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Gipsz Jakab", 2021, 400_000);
        employee.raiseSalary(100_000);
        System.out.println(employee);
        employee.setName("ifj. Gipsz Jakab");
        System.out.println("név: " + employee.getName());
        System.out.println("felvétel: " + employee.getHiringYear());
        System.out.println("fizetés: " + employee.getSalary() + " Ft");
    }
}
