package exceptions.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {
    NumbersSum numbersSum = new NumbersSum();

    @Test
    void testSumOfNumbers() {
        int[] numbers = new int[1001];
        for (int i = 0; i < 1001; i++) {
            numbers[i] = (i % 2 == 0 ? 1 : -1) * i;
        }
        assertEquals(10, numbersSum.getSum(new int[]{1, 2, 3, 4}));
        assertEquals(12_345, numbersSum.getSum(new int[]{12_345}));
        assertEquals(500, numbersSum.getSum(numbers));
        assertEquals(0, numbersSum.getSum(new int[]{2147483647, 2, 2147483647}));
    }

    @Test
    void testValidStrings() {
        assertEquals(10, numbersSum.getSum(new String[]{"1", "2", "3", "4"}));
        assertEquals(12, numbersSum.getSum(new String[]{"-1", "0", "+1", "00000000000002", "10"}));
        assertEquals(12, numbersSum.getSum(new String[]{"12"}));
    }

    @Test
    void testNull() {
        assertThrows(IllegalArgumentException.class, () -> numbersSum.getSum((int[]) null));
        assertThrows(IllegalArgumentException.class, () -> numbersSum.getSum((String[]) null));
    }

    @Test
    void testInvalidStrings() {
        assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(new String[]{"3", "2", "1", null}));
        assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(new String[]{"one", "two", "three"}));
        assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(new String[]{"2147483648"}));
        assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(new String[]{"0xFF", "3.14e2"}));
    }

    @Test
    void testEmptyArrays() {
        assertEquals(0, numbersSum.getSum(new int[]{}));
        assertEquals(0, numbersSum.getSum(new String[]{}));
    }
}