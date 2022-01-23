package lambda;

import java.util.List;

public class TreeNursery {
    private List<Sapling> saplings;

    public TreeNursery(List<Sapling> saplings) {
        this.saplings = saplings;
    }

    public List<Sapling> getSaplings() {
        return saplings;
    }

    public void prune(int maxHeight) {
        saplings.forEach(sapling -> sapling.cut(maxHeight));
    }

    public void sell(String species, int minHeight) {
        saplings.removeIf(sapling -> sapling.getSpecies().equals(species) && sapling.getHeight() > minHeight);
    }
}
