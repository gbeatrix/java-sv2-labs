package introexceptionmoreexceptions;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person(null, 32);

        System.out.println(person); // Person{name='null', age=32}
        System.out.println(person.getName()); // null
        System.out.println(person.getName().toUpperCase()); // NullPointerException-t dob, mert nem létező objektumon hívjuk a toUpperCase() metódust
    }
}
