package lambdaintro;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UsedCars {
    private List<Car> cars;

    public UsedCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> listCarsByPrice() {
        List<Car> result = new ArrayList<>(cars);
        result.sort((car1, car2) -> Integer.compare(car1.getPrice(), car2.getPrice()));
        return result;
    }

    public List<Car> listCarsByLengthDesc(){
        List<Car> result = new ArrayList<>(cars);
        result.sort((car1, car2) -> Double.compare(car2.getLength(), car1.getLength()));
        return result;
    }

    public List<Car> listCarsOneBrandByType(String brand){
        List<Car> result = filter(car -> brand.equals(car.getBrand()));
        result.sort((car1, car2) -> Collator.getInstance().compare(car1.getType(), car2.getType()));
        return result;
    }

    private List<Car> filter(Predicate<Car> condition){
        List<Car> result = new ArrayList<>();
        for (Car car : cars){
            if(condition.test(car)){
                result.add(car);
            }
        }
        return result;
    }
}
