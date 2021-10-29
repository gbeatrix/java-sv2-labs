package stringbasic;

public class UniversityMain {
    public static void main(String[] args) {
        University university = new University();

        university.addStudent(new Student(new Person("Remek Elek", "remekelek@sample.email", "123-111-001", "61400045-00000001", "+36-20/123-45-01"), "RE01EL", "12345678901"));
        university.addStudent(new Student(new Person("Zsíros B. Ödön", "zsirosbodon@sample.email", "123-222-002", "61400045-00000002", "+36-30/123-45-02"), "ZS02OD", "12345678902"));
        university.addStudent(new Student(new Person("Major Anna", "majoranna@sample.email", "123-333-003", "61400045-00000003", "+36-70/123-45-03"), "MA03AN", "12345678903"));
        university.addStudent(new Student(new Person("Gipsz Jakab", "gipszjakab@sample.email", "123-444-004", "61400045-00000004", "+(1) 123-45-04"), "GI04JA", "12345678904"));
        university.addStudent(new Student(new Person("Szikla Szilárd", "szszilard@sample.email", "123-555-005", "61400045-00000005", "+(29)/123-45-05"), "SZ05SZ", "12345678905"));
        Student student = new Student(new Person("Remek Elek", "remelek@sample.email", "N/A", "N/A", "N/A"), "RE01EL", "12345678901");

        System.out.println(university.areEqual(university.getStudents().get(0), university.getStudents().get(1)));
        System.out.println(university.areEqual(university.getStudents().get(0), student));
        System.out.println(university.getStudents());

        student = university.getStudents().get(2);
        student.setEntryCode("2021");
        System.out.println(student.getEntryCode());

        student = university.getStudents().get(4);
        System.out.println(student.getEntryCode());
    }
}
