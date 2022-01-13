package collectionslist;

import java.util.LinkedList;
import java.util.List;

public class BunchOfFlowers {
    private List<String> bunch = new LinkedList<>();

    public void addFlower(String flower) {
        bunch.add(flower);
    }

    public void addFlowerInTheMiddle(String flower) {
        int size = bunch.size();
        if (size % 2 == 1) {
            bunch.add(size / 2 + 1, flower);
        }
        bunch.add(size / 2, flower);
    }

    public List<String> getBunch() {
        return bunch;
    }
}
