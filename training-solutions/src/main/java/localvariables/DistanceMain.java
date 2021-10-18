package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(1.618, false);
        System.out.println("Távolság: "+distance.getDistanceInKm()+" km");
        System.out.println("Pontosság: "+distance.isExact());
        int km = (int)distance.getDistanceInKm();
        System.out.println("Távolság egész része: "+km+" km");
    }
}
