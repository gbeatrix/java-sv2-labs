package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private String className;
    private Random random;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random random) {
        validateArgument(className == null || random == null, "Classname and random must not be null!");
        if (isEmpty(className)) {
            throw new IllegalArgumentException("Class name must not be empty!");
        }
        this.className = className;
        this.random = random;
    }

    public String getClassName() {
        return className;
    }

    public boolean addStudent(Student student) {
        validateArgument(student == null, "Student must not be null!");
        if (students.isEmpty()) {
            return students.add(student);
        } else {
            try {
                findStudentByName(student.getName());
                return false;
            } catch (IllegalArgumentException e) {
                return students.add(student);
            }
        }
    }

    public boolean removeStudent(Student student) {
        validateArgument(student == null, "Student must not be null!");
        try {
            Student toRemove = findStudentByName(student.getName());
            return students.remove(toRemove);
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public double calculateClassAverage() {
        validateClass();
        List<Integer> grades = getGrades();
        validateGrades(grades);
        Math math = new Math();
        return math.floor(math.getAvg(grades), 2);
    }

    public double calculateClassAverageBySubject(Subject subject) {
        validateClass();
        List<Integer> grades = getGrades(subject);
        validateGrades(grades);
        Math math = new Math();
        return math.floor(math.getAvg(grades), 2);
    }

    public Student findStudentByName(String name) {
        if (students.isEmpty()) {
            throw new IllegalStateException("No students to search!");
        }
        Student toSearch = new Student(name); // validates name
        for (Student student : students) {
            if (toSearch.equalTo(student)) {
                return student;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! " + name);
    }

    public Student repetition() {
        if (students.isEmpty()) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get(random.nextInt(students.size()));
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> result = new ArrayList<>();
        for (Student student : students) {
            result.add(new StudyResultByName(student.getName(), student.calculateAverage()));
        }
        return result;
    }

    public String listStudentNames() {
        if (students.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(students.get(0).getName());
        for (int i = 1; i < students.size(); i++) {
            stringBuilder.append(", ").append(students.get(i).getName());
        }
        return stringBuilder.toString();
    }

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

    private List<Integer> getGrades() {
        List<Integer> grades = new ArrayList<>();
        for (Student student : students) {
            grades.addAll(student.getGrades());
        }
        return grades;
    }

    private List<Integer> getGrades(Subject subject) {
        List<Integer> grades = new ArrayList<>();
        for (Student student : students) {
            grades.addAll(student.getGrades(subject));
        }
        return grades;
    }

    private void validateArgument(boolean b, String s) {
        if (b) {
            throw new NullPointerException(s);
        }
    }

    private void validateClass() {
        if (students.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
    }

    private void validateGrades(List<Integer> grades) {
        if (grades.isEmpty()) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
    }
}
