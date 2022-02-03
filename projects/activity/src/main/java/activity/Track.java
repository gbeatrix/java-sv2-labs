package activity;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Scanner;

public class Track {
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public Coordinate findMaximumCoordinate() {
        double lat = trackPoints.stream().mapToDouble(t -> t.getCoordinate().getLatitude()).max().orElseThrow(() -> new IllegalArgumentException("No trackpoints"));
        double lon = trackPoints.stream().mapToDouble(t -> t.getCoordinate().getLongitude()).max().orElseThrow(() -> new IllegalArgumentException("No trackpoints"));
        return new Coordinate(lat, lon);
    }

    public Coordinate findMinimumCoordinate() {
        double lat = trackPoints.stream().mapToDouble(t -> t.getCoordinate().getLatitude()).min().orElseThrow(() -> new IllegalArgumentException("No trackpoints"));
        double lon = trackPoints.stream().mapToDouble(t -> t.getCoordinate().getLongitude()).min().orElseThrow(() -> new IllegalArgumentException("No trackpoints"));
        return new Coordinate(lat, lon);
    }

    public double getDistance() {
        double sum = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            sum += trackPoints.get(i - 1).getDistanceFrom(trackPoints.get(i));
        }
        return sum;
    }

    public double getFullDecrease() {
        return getFullElevation() - (trackPoints.get(trackPoints.size() - 1).getElevation() - trackPoints.get(0).getElevation());
    }

    public double getFullElevation() {
        double[] arr = trackPoints.stream().mapToDouble(TrackPoint::getElevation).toArray();
        double sum = 0;
        int prevx = 0;
        for (int i = 1; i <= arr.length; i++) {
            if (i == arr.length || arr[i] < arr[i - 1]) {
                sum += arr[i - 1] - arr[prevx];
                prevx = i;
            }
        }
        return sum;
    }

    public double getRectangleArea() {
        DoubleSummaryStatistics latitudeStat = trackPoints.stream().mapToDouble(tpt -> tpt.getCoordinate().getLatitude()).summaryStatistics();
        DoubleSummaryStatistics longitudeStat = trackPoints.stream().mapToDouble(tpt -> tpt.getCoordinate().getLongitude()).summaryStatistics();
        return (latitudeStat.getMax() - latitudeStat.getMin()) * (longitudeStat.getMax() - longitudeStat.getMin());
    }

    public List<TrackPoint> getTrackPoints() {
        return List.copyOf(trackPoints);
    }

    public void loadFromGpx(InputStream is) {
        Scanner scanner = new Scanner(is);
        Coordinate coordinate = null;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.startsWith("<trkpt")) {
                double lat = Double.parseDouble(line.substring(12, 22));
                double lon = Double.parseDouble(line.substring(29, 39));
                coordinate = new Coordinate(lat, lon);
            }
            if (line.startsWith("<ele")) {
                double elevation = Double.parseDouble(line.substring(5, 10));
                trackPoints.add(new TrackPoint(coordinate, elevation));
            }
        }
    }
}
