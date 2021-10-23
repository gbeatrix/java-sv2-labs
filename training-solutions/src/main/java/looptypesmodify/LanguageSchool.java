package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student remekelek = new Student("Remek Elek");
        Student zsirosbod = new Student("Zsíros B. Ödön");
        Student majoranna = new Student("Major Anna");
        Student gipszjaka = new Student("Gipsz Jakab");

        students.add(remekelek);
        students.add(zsirosbod);
        students.add(majoranna);
        students.add(gipszjaka);
        students.add(new Student("Szikla Szilárd"));

        remekelek.setActive(false);
        majoranna.setActive(false);
        students.get(3).setActive(false);

        List<Student> toRemove = new ArrayList<>();

        for(Student student : students){
            if(!student.isActive()){
                toRemove.add(student);
            }
        }
        students.removeAll(toRemove);

        System.out.println(students.size());

        for(Student student : students){
            System.out.println(student.getName());
        }
    }
}
