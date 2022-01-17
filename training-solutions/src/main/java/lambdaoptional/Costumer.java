package lambdaoptional;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Costumer {
    private List<Costume> costumes;

    public Costumer(List<Costume> costumes) {
        this.costumes = costumes;
    }

    private Optional<Costume> findFirst(Predicate<Costume> condition) {
        for (Costume costume : costumes) {
            if (condition.test(costume)) {
                return Optional.of(costume);
            }
        }
        return Optional.empty();
    }

    public Optional<Costume> findFirstCostumeWithKeyWord(String keyWord) {
        return findFirst(costume -> costume.getDescription().contains(keyWord));
    }

    public Optional<Costume> findFirstCheaperCostume(int maxPrice) {
        return findFirst(costume -> costume.getPrice() < maxPrice);
    }

    public Optional<Costume> findFirstCostumeSameSize(Size size) {
        return findFirst(costume -> costume.getSize() == size);
    }
}
