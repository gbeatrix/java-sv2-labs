package sorting;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {
    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCarsOrderedByYearOfConstruction() {
        List<Car> ordered = new ArrayList<>(cars);
        ordered.sort(new CarConstructionComparator());
        return ordered;
    }

    public List<Car> getCarsOrderedByPrice() {
        List<Car> ordered = new ArrayList<>(cars);
        ordered.sort(new CarPriceComparator());
        return ordered;
    }
}
