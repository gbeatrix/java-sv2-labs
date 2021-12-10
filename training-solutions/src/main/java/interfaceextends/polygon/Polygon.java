package interfaceextends.polygon;

public class Polygon implements Geometric {
    private double lengthOfSide;
    private int numberOfVertices;

    public Polygon(double lengthOfSide, int numberOfVertices) {
        this.lengthOfSide = lengthOfSide;
        this.numberOfVertices = numberOfVertices;
    }

    @Override
    public double getPerimeter() {
        return lengthOfSide * numberOfVertices;
    }

    @Override
    public int getNumberOfDiagonalsFromOneVertex() {
        return numberOfVertices - 3;
    }

    @Override
    public int getNumberOfAllDiagonals() {
        return numberOfVertices * (numberOfVertices - 3) / 2;
    }

    @Override
    public double getLengthOfSide() {
        return lengthOfSide;
    }

    @Override
    public int getNumberOfVertices() {
        return numberOfVertices;
    }
}
