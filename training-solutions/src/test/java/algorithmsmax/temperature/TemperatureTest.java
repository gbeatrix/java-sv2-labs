package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    @Test
    void testTemperature(){
        List<Integer> temperatures = Arrays.asList(15, 16, 17, 18, 14, 13, 15);
        int result = new Temperature().getMin(temperatures);
        assertEquals(13, result);
    }
}