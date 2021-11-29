package dynamictypes.school;

public class SchoolMain {
    public static void main(String[] args) {
        School school = new School("Iskola", 12);
        School pSchool = new PrimarySchool("Általános Iskola", 8);
        School sSchool = new SecondarySchool("Középiskola", 4);

        System.out.println(school);
        System.out.println(pSchool);
        System.out.println(sSchool);
    }
}
