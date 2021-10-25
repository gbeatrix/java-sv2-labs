package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {
        Person one;
        Person another;
        one = new Person("Jane", 23);
        another = one;
        System.out.println(one + ", " + one.getName() + ", " + one.getAge());
        another.setName("John");

        System.out.println(one + ", " + one.getName() + ", " + one.getAge());
        System.out.println(another + ", " + another.getName() + ", " + another.getAge());
        // a két kiírás azonos, mert ugyanazt az objektumot írtam ki

        int a;
        int b;
        a = 24;
        b = a;
        b++;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        // a két kiírás eltérő, mert a primitív típusú változók különböző memóriaterületen vannak

        one = new Person("Jack", 31);
        System.out.println(one + ", " + one.getName() + ", " + one.getAge());
        System.out.println(another + ", " + another.getName() + ", " + another.getAge());
        // a két kiírás eltér, mert one az új objektumpéldányra mutat, another pedig a régire
    }
}
