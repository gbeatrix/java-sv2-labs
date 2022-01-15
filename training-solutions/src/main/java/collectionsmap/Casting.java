package collectionsmap;

import java.util.Map;

public class Casting {
    public String callNextApplicant(int lastNumber, Map<Integer, String> applicants) {
        if (applicants.isEmpty()) {
            return null;
        }
        int minNumber = lastNumber;
        for (int number : applicants.keySet()) {
            if (minNumber <= lastNumber) {
                if (number > lastNumber) {
                    minNumber = number;
                } else {
                    minNumber = Math.min(number, minNumber);
                }
            } else if (number > lastNumber) {
                minNumber = Math.min(number, minNumber);
            }
        }
        return applicants.get(minNumber);
    }
}
