package collectionsequalshash;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String ssn;

    public Person(String name, int age, String ssn) {
        this.name = name;
        this.age = age;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSsn() {
        return ssn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return ssn.equals(person.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ssn);
    }

    public static void main(String[] args) {
        Person majorAnna = new Person("Major Anna", 24, "123 456 789");
        Person gipszne = new Person("Gipsz Jakabné", 26, "123 456 789");
        System.out.println("equals: " + majorAnna.equals(gipszne));
        System.out.println("equals: " + gipszne.equals(majorAnna));
        System.out.println("equals: " + Objects.equals(gipszne, majorAnna));
        System.out.println("equals: " + Objects.equals(majorAnna, gipszne));
        System.out.println("same: " + (gipszne == majorAnna));

        System.out.println("1. hash: " + Integer.toUnsignedString(majorAnna.hashCode(), 16));
        System.out.println("2. hash: " + gipszne.toString().split("@")[1]);
        System.out.println("1. hash: " + majorAnna.hashCode());
        System.out.println("2. hash: " + gipszne.hashCode());
        System.out.println("same: " + (majorAnna.hashCode() == gipszne.hashCode()));
    }
}
