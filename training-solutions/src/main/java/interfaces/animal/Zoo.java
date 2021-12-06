package interfaces.animal;

import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public int getNumberOfAllLegs() {
        int sum = 0;
        for (Animal animal : animals) {
            sum += animal.getNumberOfLegs();
        }
        return sum;
    }

    public int getNumberOfAnimals() {
        return animals.size();
    }
}
