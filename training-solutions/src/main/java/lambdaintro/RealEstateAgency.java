package lambdaintro;

import java.util.List;
import java.util.function.Predicate;

public class RealEstateAgency {
    private List<Flat> flats;

    public RealEstateAgency(List<Flat> flats) {
        this.flats = flats;
    }

    private Flat findFirst(Predicate<Flat> condition){
        for (Flat flat : flats){
            if(condition.test(flat)){
                return flat;
            }
        }
        throw new IllegalArgumentException("No such flat.");
    }

    public Flat findFirstCheaperFlat(int minPrice){
        return findFirst(flat -> flat.getPrice() < minPrice);
    }

    public Flat findFirstGreaterFlat(double maxArea){
        return findFirst(flat -> flat.getArea() > maxArea);
    }

    public Flat findFirstFlatInSameTown(String town){
        return findFirst(flat -> flat.getAddress().contains(town));
    }
}
