package inheritancemethods.cars;

public class Jeep extends Car {
    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        if (extraFuel > extraCapacity) {
            throw new IllegalArgumentException("Extra capacity is less than extra fuel!");
        }
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    @Override
    public void drive(int km) {
        double capacityInKms = (extraFuel + getFuel()) / getFuelRate() * 100d;
        if (km <= capacityInKms) {
            extraFuel -= km / 100d * getFuelRate();
            if (extraFuel < 0) {
                modifyFuelAmount(extraFuel);
                extraFuel = 0;
            }
        } else {
            throw new IllegalArgumentException("Not enough fuel available!");
        }
    }

    @Override
    public double calculateRefillAmount() {
        return super.calculateRefillAmount() + extraCapacity - extraFuel;
    }
}
