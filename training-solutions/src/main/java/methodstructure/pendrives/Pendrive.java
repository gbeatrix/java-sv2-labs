package methodstructure.pendrives;

public class Pendrive {
    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public void risePrice(int percent) {
        price += (int) (price * (percent / 100d));
    }

    public int comparePricePerCapacity(Pendrive other) {
        if (getPricePerCapacity() > other.getPricePerCapacity()) {
            return 1;
        } else if (getPricePerCapacity() < other.getPricePerCapacity()) {
            return -1;
        } else {
            return 0;
        }
    }

    public boolean isCheaperThan(Pendrive other) {
        return price < other.price;
    }

    @Override
    public String toString() {
        return "Pendrive {" +
                "név: '" + name + '\'' +
                ", kapacitás: " + capacity +
                "GB, ár: " + price +
                "Ft}";
    }

    private double getPricePerCapacity() {
        return (double) price / capacity;
    }
}
