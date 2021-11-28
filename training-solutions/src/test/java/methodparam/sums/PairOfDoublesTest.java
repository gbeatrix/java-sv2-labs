package methodparam.sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairOfDoublesTest {
    @Test
    void testPairOfDoubles() {
        double[] floats = {1, 2, -3, -4, 5, -6};
        PairOfDoubles pairOfDoubles = new PairOfDoubles();
        for (double num : floats) {
            pairOfDoubles.addNumber(num);
        }
        assertEquals(8, pairOfDoubles.getSumOfPositiveNumbers());
        assertEquals(-13, pairOfDoubles.getSumOfNegativeNumbers());
    }
}