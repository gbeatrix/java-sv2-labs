package finalmodifier;

import static finalmodifier.CircleCalculator.PI;

public class CylinderCalculator {
    public double calculateVolume(double r, double h){
        return r*r*PI*h;
    }

    public double calculateSurfaceArea(double r, double h){
        return 2*r*PI*h + 2*r*r*PI;
    }
}
