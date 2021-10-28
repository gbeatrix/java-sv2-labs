package enumtype.position;

public class PositionMain {
    public static void main(String[] args) {
        System.out.println("Az alábbi pozíciókra keresünk embereket:");
        for (Position position : Position.values()) {
            System.out.println(position.name() + " " + position.getSalary() + " Ft/hó + " + position.getBenefit());
        }
    }
}
