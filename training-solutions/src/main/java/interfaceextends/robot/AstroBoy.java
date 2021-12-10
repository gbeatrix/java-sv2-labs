package interfaceextends.robot;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot {
    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();

    public static final long ALTITUDE = 5;

    public AstroBoy(Point position) {
        this.position = position;
    }

    public void flyTo(Point position) {
        walkTo(position);
    }

    @Override
    public void liftTo(long altitude) {
        position = new Point(position.getX(), position.getY(), altitude);
        path.add(position);
    }

    @Override
    public void moveTo(Point position) {
        walkTo(position);
    }

    @Override
    public void fastMoveTo(Point position) {
        liftTo(ALTITUDE);
        walkTo(new Point(position.getX(), position.getY(), ALTITUDE));
        liftTo(position.getZ());
    }

    @Override
    public void rotate(int angle) {
        this.angle += angle;
    }

    @Override
    public List<Point> getPath() {
        return path;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    public long getAltitude() {
        return position.getZ();
    }

    private void walkTo(Point position) {
        this.position = position;
        path.add(position);
    }
}
