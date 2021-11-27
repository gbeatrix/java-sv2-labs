package algorithmsmax.hill;

import java.util.List;

public class Hill {
    public int getMax(List<Integer> heights) {
        int max = heights.get(0);
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }
}
