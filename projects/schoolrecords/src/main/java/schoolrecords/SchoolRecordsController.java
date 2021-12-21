package schoolrecords;

import java.util.*;

public class SchoolRecordsController {
    private final List<Tutor> tutors = new ArrayList<>();
    private final List<Subject> subjects = new ArrayList<>();
    private final ClassRecords classRecords = new ClassRecords("mintaosztály", new Random());

    public static void main(String[] args) {
        SchoolRecordsController schoolRecordsController = new SchoolRecordsController();
        schoolRecordsController.initSchool();
        schoolRecordsController.runMenu();
    }

    public void initSchool() {
        subjects.add(new Subject("biológia"));
        subjects.add(new Subject("kémia"));
        subjects.add(new Subject("történelem"));
        subjects.add(new Subject("földrajz"));
        subjects.add(new Subject("matematika"));
        subjects.add(new Subject("fizika"));
        subjects.add(new Subject("informatika"));
        subjects.add(new Subject("angol"));

        tutors.add(new Tutor("Mezei Virág",
                Arrays.asList(subjects.get(0), subjects.get(1), subjects.get(3), subjects.get(5))));
        tutors.add(new Tutor("Gipsz Jakab",
                Arrays.asList(subjects.get(2), subjects.get(3))));
        tutors.add(new Tutor("Remek Elek",
                Arrays.asList(subjects.get(4), subjects.get(5), subjects.get(6))));
    }

    public void runMenu() {
        int choice = -1;
        do {
            printMenu();
            try {
                choice = Integer.parseInt(new Scanner(System.in).nextLine());
                switch (choice) {
                    case 1:
                        listStudentNames();
                        break;
                    case 2:
                        findStudentByName();
                        break;
                    case 3:
                        addStudent();
                        break;
                    case 4:
                        removeStudent();
                        break;
                    case 5:
                        repetition();
                        break;
                    case 6:
                        calculateClassAverage();
                        break;
                    case 7:
                        calculateClassAverageBySubject();
                        break;
                    case 8:
                        listStudyResults();
                        break;
                    case 9:
                        calculateStudentAverage();
                        break;
                    case 10:
                        calculateStudentAverageBySubject();
                        break;
                    case 11:
                        System.out.println("Kilépés.");
                        break;
                    default:
                        printHelp();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (choice != 11);
    }

    private void calculateStudentAverageBySubject() {
        Student student = getStudent();
        Subject subject = getSubject();
        System.out.println("A diák tantárgyi átlaga: " + student.calculateSubjectAverage(subject));
    }

    private void calculateStudentAverage() {
        Student student = getStudent();
        System.out.println("A diák átlaga: " + student.calculateAverage());
    }

    private void listStudyResults() {
        List<StudyResultByName> result = classRecords.listStudyResults();
        for (StudyResultByName item : result) {
            System.out.printf("%15s %1.2f%n", item.getStudentName(), item.getStudyAverage());
        }
    }

    private void calculateClassAverageBySubject() {
        Subject subject = getSubject();
        System.out.println("A tantárgyi átlag: " + classRecords.calculateClassAverageBySubject(subject));
    }

    private void calculateClassAverage() {
        System.out.println("Az osztályátlag: " + classRecords.calculateClassAverage());
    }

    private void repetition() {
        Student student = classRecords.repetition();
        System.out.println("A választott diák: " + student.getName());
        String mark = getMark();
        Subject subject = getSubject();
        Tutor tutor = getTutor();
        if (!tutor.tutorTeachingSubject(subject)) {
            throw new IllegalArgumentException(tutor.getName() + " nem tanítja a(z) " + subject.getSubjectName() + " tantárgyat.");
        }
        student.grading(new Mark(mark, subject, tutor));
    }

    private String getMark() {
        System.out.println("Add meg az érdemjegyet (A/B/C/D/F): ");
        return new Scanner(System.in).nextLine();
    }

    private void removeStudent() {
        String name = getStudentName();
        classRecords.removeStudent(new Student(name));
    }

    private void addStudent() {
        String name = getStudentName();
        classRecords.addStudent(new Student(name));
    }

    private void findStudentByName() {
        String studentName = getStudentName();
        Student student = classRecords.findStudentByName(studentName);
        System.out.println(student);
    }

    private void listStudentNames() {
        System.out.println(classRecords.listStudentNames());
    }

    private void printHelp() {
        System.out.println("Írd be a választott menüpont sorszámát, majd üss entert.");
    }

    private String getStudentName() {
        System.out.print("Add meg a diák nevét: ");
        return new Scanner(System.in).nextLine();
    }

    private Student getStudent() {
        String name = getStudentName();
        return classRecords.findStudentByName(name);
    }

    private Subject getSubject() {
        for (int i = 0; i < subjects.size(); i++) {
            System.out.println((i + 1) + ". " + subjects.get(i).getSubjectName());
        }
        System.out.print("Add meg a tantárgy sorszámát: ");
        int subject = Integer.parseInt(new Scanner(System.in).nextLine()) - 1;
        return subjects.get(subject);
    }

    private Tutor getTutor() {
        for (int i = 0; i < tutors.size(); i++) {
            System.out.println((i + 1) + ". " + tutors.get(i).getName());
        }
        System.out.print("Add meg a tanár sorszámát: ");
        int tutor = Integer.parseInt(new Scanner(System.in).nextLine()) - 1;
        return tutors.get(tutor);
    }

    private void printMenu() {
        List<String> menu = Arrays.asList(
                "1. Diákok nevének listázása",
                "2. Diák név alapján keresése",
                "3. Diák létrehozása",
                "4. Diák név alapján törlése",
                "5. Diák feleltetése",
                "6. Osztályátlag kiszámolása",
                "7. Tantárgyi átlag kiszámolása",
                "8. Diákok átlagának megjelenítése",
                "9. Diák átlagának kiírása",
                "10. Diák tantárgyhoz tartozó átlagának kiírása",
                "11. Kilépés"
        );

        System.out.println();
        for (String menuItem : menu) {
            System.out.println(menuItem);
        }
        System.out.print("Válassz egy menüpontot: ");
    }
}
