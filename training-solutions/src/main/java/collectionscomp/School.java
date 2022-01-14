package collectionscomp;

import java.text.Collator;
import java.util.*;

public class School {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kati", 165));
        students.add(new Student("Imre", 182));
        students.add(new Student("Mária", 160));
        students.add(new Student("Bence", 172));
        students.add(new Student("Piroska", 161));
        System.out.println("eredeti sorrend: " + students);

        Set<Student> treeSet = new TreeSet<>(new StudentComparator());
        treeSet.addAll(students);
        System.out.println("magasság szerint rendezve: " + treeSet);

        Map<String, Integer> treeMap = new TreeMap<>(Collator.getInstance(new Locale("hu", "HU")));
        for (Student student : students){
            treeMap.put(student.getName(), student.getHeight());
        }
        System.out.println("név szerint rendezve: " + treeMap);
    }
}
