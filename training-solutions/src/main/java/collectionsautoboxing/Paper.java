package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Paper {
    private Map<String, Integer> paper = new HashMap<>();

    public Map<String, Integer> getPaper() {
        return Map.copyOf(paper);
    }

    public void putFurtherPaper(String className, int kilogramms) {
        if (kilogramms <= 0) {
            throw new IllegalArgumentException("Weight must be positive");
        } else if (paper.containsKey(className)) {
            paper.put(className, paper.get(className) + kilogramms);
        } else {
            paper.put(className, kilogramms);
        }
    }

    public String getWinnerClass() {
        if (paper.isEmpty()) {
            throw new IllegalArgumentException("No players");
        }
        String winnerName = "";
        int winnerKg = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> actual : paper.entrySet()) {
            if (winnerKg < actual.getValue()) {
                winnerKg = actual.getValue();
                winnerName = actual.getKey();
            }
        }
        return winnerName;
    }

    public int getTotalWeight() {
        int sum = 0;
        for (int weight : paper.values()) {
            sum += weight;
        }
        return sum;
    }
}
