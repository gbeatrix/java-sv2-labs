package streamsalgorithms;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private String name;
    private int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return name + " (" + yearOfBirth + ")";
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Major Anna", 1995));
        employees.add(new Employee("Gipsz Jakab", 1992));
        employees.add(new Employee("Minta Áron", 1970));
        employees.add(new Employee("Zsíros B. Ödön", 1975));
        employees.add(new Employee("Szikla Szilárd", 1978));

//      Összegezd az alkalmazottak születési éveit!
        System.out.println(employees.stream().mapToInt(Employee::getYearOfBirth).sum());

//      Összegezd az alkalmazottak életkorát!
        int currentYear = LocalDate.now().getYear();
        System.out.println(employees.stream().mapToInt(employee -> currentYear - employee.getYearOfBirth()).sum());

//      Add vissza streammel, hány alkalmazott van a listában!
        System.out.println(employees.stream().count());

//      Add vissza, hány alkalmazott született 1990-nél korábban!
        System.out.println(employees.stream().filter(employee -> employee.getYearOfBirth() < 1990).count());

//      Add vissza a legkorábban született alkalmazott születési évét!
        System.out.println(employees.stream().mapToInt(Employee::getYearOfBirth).min().orElseThrow());

//      Add vissza a legkorábban született alkalmazott nevét! (Itt szükség lesz a findFirst() záróműveletre.)
        System.out.println(employees.stream().sorted(Comparator.comparing(Employee::getYearOfBirth)).findFirst().map(Employee::getName).orElseThrow());

//      Add vissza, hogy igaz-e, hogy minden alkalmazott 1980 előtt született-e?
        System.out.println(employees.stream().allMatch(employee -> employee.getYearOfBirth() < 1980));

//      Add vissza egy listában az összes, 1990-nél korábban született alkalmazottat!
        System.out.println(employees.stream().filter(employee -> employee.getYearOfBirth() < 1990).toList());

//      Add vissza egy listában az összes alkalmazott nevét!
        System.out.println(employees.stream().map(Employee::getName).toList());

//      Az előző két feladat kombinációja: Add vissza egy listában az összes, 1990-nél korábban született alkalmazott nevét!
        System.out.println(employees.stream().filter(employee -> employee.getYearOfBirth() < 1990).map(Employee::getName).toList());
    }
}
