package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
    @Test
    void testNumbers() {
        assertEquals(0, new Numbers().getSum(new int[]{}));
        assertEquals(1, new Numbers().getSum(new int[]{1}));

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = i + 1;
        }
        assertEquals(55, new Numbers().getSum(numbers));

        for (int i = 1; i < 10; i++) {
            numbers[i] = -numbers[i - 1];
        }
        assertEquals(0, new Numbers().getSum(numbers));
    }
}