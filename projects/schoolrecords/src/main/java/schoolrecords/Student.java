package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        if (name == null) {
            throw new NullPointerException("Student name must be not null.");
        }
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name.trim();
    }

    public String getName() {
        return name;
    }

    public void grading(Mark mark) {
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    public double calculateAverage() {
        Math math = new Math();
        return math.floor(math.getAvg(getGrades()), 2);
    }

    public double calculateSubjectAverage(Subject subject) {
        if (subject == null) {
            throw new NullPointerException("Subject must be not null.");
        }
        Math math = new Math();
        return math.floor(math.getAvg(getGrades(subject)), 2);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name);
        sb.append(" marks: ");
        boolean first = true;
        for (Mark mark : marks) {
            if (first) {
                first = false;
            } else {
                sb.append(", ");
            }
            sb.append(mark.getSubject().getSubjectName())
                    .append(": ")
                    .append(mark);
        }
        return sb.toString();
    }

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

    public boolean equalTo(Student student) {
        if (student == null) {
            throw new NullPointerException("Student must be not null");
        }
        return this.name.equals(student.name);
    }

    public List<Double> getGrades() {
        List<Double> grades = new ArrayList<>(marks.size());
        for (Mark mark : marks) {
            grades.add((double) mark.getMarkType().getGrade());
        }
        return grades;
    }

    public List<Double> getGrades(Subject subject) {
        if (subject == null) {
            throw new NullPointerException("Subject must be not null.");
        }
        List<Double> grades = new ArrayList<>();
        for (Mark mark : marks) {
            if (mark.getSubject().equalTo(subject)) {
                grades.add((double) mark.getMarkType().getGrade());
            }
        }
        return grades;
    }

}
