package interfacedefaultmethods.cloth;

public interface Square {
    default int getNumberOfSides() {
        return 4;
    }

    default double getLengthOfDiagonal() {
        return getSide() * Math.sqrt(2);
    }

    default double getPerimeter() {
        return getSide() * 4;
    }

    default double getArea() {
        return Math.pow(getSide(), 2);
    }

    double getSide();
}
