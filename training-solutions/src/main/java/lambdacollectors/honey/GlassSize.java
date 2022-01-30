package lambdacollectors.honey;

public enum GlassSize {
    BIG(1.0),
    SMALL(0.5),
    TASTER_SIZE(0.05);

    private double capacityInKg;

    GlassSize(double capacityInKg) {
        this.capacityInKg = capacityInKg;
    }

    public double getCapacityInKg() {
        return capacityInKg;
    }
}
