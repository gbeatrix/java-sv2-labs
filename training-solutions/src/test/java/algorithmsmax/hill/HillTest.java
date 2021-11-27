package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {
    @Test
    void testHill(){
        List<Integer> heights = Arrays.asList(971, 964, 1014, 961);
        int result = new Hill().getMax(heights);
        assertEquals(1014, result);
    }
}