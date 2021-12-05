package abstractclass.gamecharacter;

public class Point {
    private long x;
    private long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public double distance(Point other) {
        return Math.sqrt(Math.pow((double) x - other.x, 2) + Math.pow((double) y - other.y, 2));
    }

    public long getDistance(Point other) {
        return (long) distance(other);
    }
}
