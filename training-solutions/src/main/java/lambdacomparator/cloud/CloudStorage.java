package lambdacomparator.cloud;

import java.util.Comparator;
import java.util.Objects;

/**
 * Note: this class has a natural ordering that is inconsistent with equals.
 */
public class CloudStorage implements Comparable<CloudStorage> {
    private String provider;
    private int space;  // in GB
    private double price;
    private PayPeriod period;

    public CloudStorage(String provider, int space, PayPeriod period, double price) {
        this.provider = provider;
        this.space = space;
        this.price = price;
        this.period = period;
    }

    public CloudStorage(String provider, int space) {
        this.provider = provider;
        this.space = space;
    }

    public String getProvider() {
        return provider;
    }

    public int getSpace() {
        return space;
    }

    public double getPrice() {
        return price;
    }

    public PayPeriod getPeriod() {
        return period;
    }

    @Override
    public int compareTo(CloudStorage o) {
        return Comparator.comparing(CloudStorage::getUnitPrice, Comparator.nullsFirst(Comparator.naturalOrder())).compare(this, o);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CloudStorage storage = (CloudStorage) o;
        return space == storage.space && Double.compare(storage.price, price) == 0 && Objects.equals(provider, storage.provider) && period == storage.period;
    }

    @Override
    public int hashCode() {
        return Objects.hash(provider, space, price, period);
    }

    private Double getUnitPrice() {
        if (period == null) {
            return null;
        }
        return price * (12d / period.getLength()) * (1000d / space);
    }

    @Override
    public String toString() {
        return "CloudStorage{" +
                "provider='" + provider + '\'' +
                ", space=" + space +
                ", price=" + price +
                ", period=" + period +
                '}';
    }
}
