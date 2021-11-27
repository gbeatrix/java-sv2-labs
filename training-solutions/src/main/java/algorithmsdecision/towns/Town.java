package algorithmsdecision.towns;

import java.util.List;

public class Town {
    public boolean containsFewerHabitants(List<Integer> population, int limit){
        for (int i : population) {
            if (i < limit) {
                return true;
            }
        }
        return false;
    }
}
