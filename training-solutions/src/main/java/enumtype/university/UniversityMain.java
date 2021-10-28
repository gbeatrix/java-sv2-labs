package enumtype.university;

public class UniversityMain {
    public static void main(String[] args) {
        System.out.println("Néhány magyar egyetem");
        for(University university : University.values()){
            System.out.println(university + ": " + university.getName());
        }
    }
}
