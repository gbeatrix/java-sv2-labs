package inheritanceconstructor.tea;

public class TeaMain {
    public static void main(String[] args) {
        Tea tea = new Tea("Fekete tea", 359);
        System.out.println(tea.getName() + " - " + tea.getPrice() + " Ft");
        HerbalTea herbalTea = new HerbalTea("Hársfavirág gyógynövénytea", 629);
        System.out.println(herbalTea.getName() + " - " + herbalTea.getPrice() + " Ft");
    }
}
