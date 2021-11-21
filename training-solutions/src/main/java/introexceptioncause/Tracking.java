package introexceptioncause;

import java.util.List;

public class Tracking {
    public static void main(String[] args) {
        try {
            TrackPoints trackPoints = new TrackPoints();
            List<String> contents = trackPoints.readData();
            trackPoints.writeData(contents);
        } catch (IllegalArgumentException err) {
            System.out.println(err.getMessage());
            System.out.println(err.getCause().getMessage());
        }
    }
}
