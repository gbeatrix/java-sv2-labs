package interfacestaticmethods.vehicle;

public interface Vehicle {
    static Vehicle of(int numberOfWheels) {
        switch (numberOfWheels) {
            case 2:
                return new Bicycle(numberOfWheels);
            case 4:
                return new Car(numberOfWheels);
            default:
                throw new IllegalArgumentException("This is neither a bicycle nor a car.");
        }
    }
}
