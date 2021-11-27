package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {
    @Test
    void myTestCountChildrenWithHeightGreaterThan() {
        List<Integer> heights = Arrays.asList(119, 117, 120, 125, 123, 117, 121);
        int minHeight = 120;
        int result = new Height().countChildrenWithHeightGreaterThan(heights, minHeight);
        assertEquals(3, result);
    }

    @Test
    void testCountChildrenWithHeightGreaterThan() {
        List<Integer> heights = Arrays.asList(123, 156, 147, 109, 168, 119);
        Height height = new Height();
        int expected = height.countChildrenWithHeightGreaterThan(heights, 120);

        assertEquals(4, expected);
    }
}