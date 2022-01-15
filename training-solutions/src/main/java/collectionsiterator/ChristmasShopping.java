package collectionsiterator;

import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {
    private List<ChristmasPresent> presents;

    public ChristmasShopping(List<ChristmasPresent> presents) {
        this.presents = presents;
    }

    public List<ChristmasPresent> getPresents() {
        return List.copyOf(presents);
    }

    public void addNewPresent(ChristmasPresent present) {
        presents.add(present);
    }

    public void removeTooExpensivePresent(int maxPrice) {
        Iterator<ChristmasPresent> it = presents.iterator();
        while (it.hasNext()) {
            if (it.next().getPrice() > maxPrice) {
                it.remove();
            }
        }
    }
}
