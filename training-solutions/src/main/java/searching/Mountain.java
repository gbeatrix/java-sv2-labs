package searching;

import java.util.Arrays;

public class Mountain {
    private int[] heights;

    public Mountain(int[] heights) {
        for (int i = 1; i < heights.length; i++) {
            if(heights[i-1] > heights[i]){
                throw new IllegalArgumentException("Array must be sorted");
            }
        }
        this.heights = heights;
    }

    public boolean searchPeak(Peak peak) {
        return 0 <= Arrays.binarySearch(heights, peak.getHeight());
    }
}
