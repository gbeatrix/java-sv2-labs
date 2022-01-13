package collectionsset;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhysicalEducation {
    public Set<Integer> getOrderInLessons(List<Student> students){
        Set<Integer> heights = new TreeSet<>();
        for (Student student : students){
            heights.add(student.getHeight());
        }
        return heights;
    }

    public static void main(String[] args) {
        PhysicalEducation physicalEducation= new PhysicalEducation();
        List<Student> students = new LinkedList<>();
        students.add(new Student("Kati", 165));
        students.add(new Student("Imre", 182));
        students.add(new Student("Mária", 160));
        students.add(new Student("Bence", 172));
        students.add(new Student("Piroska", 161));
        Set<Integer> heights = physicalEducation.getOrderInLessons(students);
        System.out.println(heights);
    }
}
