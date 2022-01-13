package searching;

import java.text.Collator;
import java.util.*;

public class LostAndFoundOffice {
    List<LostProperty> properties = new LinkedList<>();

    public void addProperty(LostProperty property) {
        int index = Collections.binarySearch(properties, property);
        index = index >= 0 ? index : -(index + 1);
        properties.add(index, property);
    }

    public LostProperty findLostProperty(LostProperty property) {
        int index = Collections.binarySearch(properties, property);
        if (index >= 0) {
            return properties.get(index);
        } else {
            throw new IllegalArgumentException("Property not found.");
        }
    }

    public LostProperty findLostProperty(String description) {
        int index = Collections.binarySearch(properties, new LostProperty(description), new Comparator<LostProperty>() {
            @Override
            public int compare(LostProperty o1, LostProperty o2) {
                return Collator.getInstance().compare(o1.getDescription(), o2.getDescription());
            }
        });
        if (index < 0) {
            throw new IllegalArgumentException("Property not found.");
        } else {
            return properties.get(index);
        }
    }
}
