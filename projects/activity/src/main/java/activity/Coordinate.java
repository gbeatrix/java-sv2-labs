package activity;

public class Coordinate {
    private double latitude;
    private double longitude;

    public Coordinate(double latitude, double longitude) {
        if (Math.abs(latitude) > 90) {
            throw new IllegalArgumentException("Latitude must be in [-90, 90], but given " + latitude);
        }
        if (Math.abs(longitude) > 180) {
            throw new IllegalArgumentException("Latitude must be in [-180, 180], but given " + longitude);
        }
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
