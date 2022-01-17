package lambdacomparator.cloud;

import java.text.Collator;
import java.util.*;

public class Clouds {
    public static CloudStorage alphabeticallyFirst(List<CloudStorage> storages) {
        return Collections.min(storages, Comparator.comparing(CloudStorage::getProvider, Collator.getInstance(new Locale("hu", "HU"))));
    }

    public static CloudStorage bestPriceForShortestPeriod(List<CloudStorage> storages) {
        return Collections.min(storages, Comparator
                .comparing(CloudStorage::getPeriod, Comparator.nullsFirst(Comparator.comparingInt(PayPeriod::getLength)))
                .thenComparing(CloudStorage::getPrice));
    }

    public static List<CloudStorage> worstOffers(List<CloudStorage> storages) {
        storages = new ArrayList<>(storages);
        Collections.sort(storages, Comparator.reverseOrder());
        return storages.subList(0, Math.min(3, storages.size()));
    }
}
