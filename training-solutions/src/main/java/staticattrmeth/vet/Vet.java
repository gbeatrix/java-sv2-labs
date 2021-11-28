package staticattrmeth.vet;

import java.util.ArrayList;
import java.util.List;

public class Vet {
    private static long code = 1;
    private List<Dog> dogs = new ArrayList<>();

    public void addDog(Dog dog) {
        dog.setCodeNumber(code++);
        dogs.add(dog);
    }

    public List<Dog> getDogs() {
        return dogs;
    }
}
