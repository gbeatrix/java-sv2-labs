package finalmodifier;

public class PiMain {
    public static void main(String[] args) {
        double radius = 10;
        double height = 20;
        CircleCalculator circleCalculator = new CircleCalculator();
        CylinderCalculator cylinderCalculator1 = new CylinderCalculator();
        CylinderCalculatorBasedOnCircle cylinderCalculator2 = new CylinderCalculatorBasedOnCircle();

        System.out.println("kör területe: " + circleCalculator.calculateArea(radius));
        System.out.println("kör kerülete: " + circleCalculator.calculatePerimeter(radius));

        System.out.println("henger térfogata: " + cylinderCalculator1.calculateVolume(radius, height));
        System.out.println("henger felszíne: " + cylinderCalculator1.calculateSurfaceArea(radius, height));

        System.out.println("henger térfogata: " + cylinderCalculator2.calculateVolume(radius, height));
        System.out.println("henger felszíne: " + cylinderCalculator2.calculateSurfaceArea(radius, height));

        System.out.println("PI értéke: " + CircleCalculator.PI);
    }
}
