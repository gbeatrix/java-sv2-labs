package methodstructure.pendrives;

import java.util.List;

public class Pendrives {
    public Pendrive getBest(List<Pendrive> pendrives) {
        Pendrive best = pendrives.get(0);
        for (Pendrive pendrive : pendrives) {
            if (best.comparePricePerCapacity(pendrive) == 1) {
                best = pendrive;
            }
        }
        return best;
    }

    public Pendrive getCheapest(List<Pendrive> pendrives) {
        Pendrive cheapest = pendrives.get(0);
        for (Pendrive pendrive : pendrives) {
            if (!cheapest.isCheaperThan(pendrive)) {
                cheapest = pendrive;
            }
        }
        return cheapest;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendrives, int percent, int capacity) {
        for (Pendrive pendrive : pendrives) {
            if (pendrive.getCapacity() == capacity) {
                pendrive.risePrice(percent);
            }
        }
    }
}
