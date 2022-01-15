package collectionsqueue;

public class ComparablePerson extends Person implements Comparable<ComparablePerson> {
    public ComparablePerson(String name, int age) {
        super(name, age);
    }

    @Override
    public int compareTo(ComparablePerson o) {
        return Integer.compare(getAge(), o.getAge());
    }

    @Override
    public String toString() {
        return getName() + " (" + getAge() + ")";
    }
}