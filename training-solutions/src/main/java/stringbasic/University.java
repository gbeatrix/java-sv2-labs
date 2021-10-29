package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public boolean areEqual(Student student, Student anotherStudent){
        return student.getNeptun().equals(anotherStudent.getNeptun()) &&
                student.getEduId().equals(anotherStudent.getEduId());
    }
}
