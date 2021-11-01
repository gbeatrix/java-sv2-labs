package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class NumbersTest {
    @Test
    void testGetEvenNumbers(){
        Numbers numbers = new Numbers();
        int[] inArr  = {2, 8, 5, 6, 2, 3, 9};
        int[] expArr = {2, 8, 0, 6, 2, 0, 0};
        assertArrayEquals(expArr, numbers.getEvenNumbers(inArr));
    }
}
