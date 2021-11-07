package controladvanced.labels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LabelsTest {
    @Test
    void testGetTableOfNumbers() {
        Labels labels = new Labels();
        int[][] result = labels.getTableOfNumbers(10);
        assertEquals(12, result[5][5]);
        assertEquals(12, result[4][6]);
        assertEquals(12, result[0][10]);
    }
}