package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {
    private List<Trooper> troopers = new ArrayList<>();

    public List<Trooper> getTroopers() {
        return List.copyOf(troopers);
    }

    public void addTrooper(Trooper trooper) {
        if (trooper == null) {
            throw new IllegalArgumentException("The trooper is required.");
        }
        troopers.add(trooper);
    }

    public void moveTrooperByName(String name, Position target) {
        Trooper trooper = findTrooperByName(name);
        moveTrooper(trooper, target);
    }

    public void moveClosestTrooper(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("The target is required.");
        }
        Trooper trooper = findClosestTrooper(target);
        moveTrooper(trooper, target);
    }

    private Trooper findTrooperByName(String name) {
        for (Trooper trooper : troopers) {
            if (trooper.getName().equals(name)) {
                return trooper;
            }
        }
        return null;
    }

    private Trooper findClosestTrooper(Position target) {
        if (!troopers.isEmpty()) {
            Trooper closest = troopers.get(0);
            for (Trooper trooper : troopers) {
                if (trooper.distanceFrom(target) < closest.distanceFrom(target)) {
                    closest = trooper;
                }
            }
            return closest;
        }
        return null;
    }

    private void moveTrooper(Trooper trooper, Position target) {
        if (trooper != null) {
            trooper.changePosition(target);
        }
    }
}
