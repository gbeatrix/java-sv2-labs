package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BucketList {
    private List<Destination> destinations = new ArrayList<>();

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public Optional<Destination> getDestinationWithKeyword(String keyword) {
        for (Destination destination : destinations) {
            if (destination.getDescription().contains(keyword)) {
                return Optional.of(destination);
            }
        }
        return Optional.empty();
    }

    public Optional<Destination> getDestinationNearerThanGiven(int maxKm) {
        for (Destination destination : destinations) {
            if (destination.getKmFromHome() < maxKm) {
                return Optional.of(destination);
            }
        }
        return Optional.empty();
    }
}
