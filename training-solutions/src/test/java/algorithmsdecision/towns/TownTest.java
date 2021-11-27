package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {
    List<Integer> data = Arrays.asList(36_992, 84_646, 89_261, 48_746, 78_757, 117_304, 140_205, 40_309, 64_227, 74_168,
            27_824, 52_466, 36_120, 77_720, 110_033, 24_487, 67_781, 47_126);
    Town town = new Town();

    @Test
    void testTown(){
        assertTrue(town.containsFewerHabitants(data, 500_000));
        assertFalse(town.containsFewerHabitants(data, 0));
        assertTrue(town.containsFewerHabitants(data, 25000));
        assertFalse(town.containsFewerHabitants(data, 24000));
    }
}