package looptypes;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    public void printStudyGroups(List<String> students){
        List<String> group1 = new ArrayList<>();
        List<String> group2 = new ArrayList<>();
        for(String student : students){
            if(student.length()<=10){
                group1.add(student);
            } else {
                group2.add(student);
            }
        }
        System.out.println("1. csoport: " + group1);
        System.out.println("2. csoport: " + group2);
    }

    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Remek Elek");
        students.add("Zsíros B. Ödön");
        students.add("Major Anna");
        students.add("Gipsz Jakab");
        students.add("Szikla Szilárd");

        StudyGroup studyGroup = new StudyGroup();
        studyGroup.printStudyGroups(students);
    }
}
