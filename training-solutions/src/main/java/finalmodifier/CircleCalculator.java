package finalmodifier;

public class CircleCalculator {
    public static final double PI = 3.14159;

    double calculatePerimeter(double r){
        return 2*r*PI;
    }

    double calculateArea(double r){
        return r*r*PI;
    }
}
