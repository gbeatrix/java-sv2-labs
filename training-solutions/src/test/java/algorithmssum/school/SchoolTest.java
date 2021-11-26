package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SchoolTest {
    @Test
    void myTestSchool() {
        List<Integer> headcounts = Arrays.asList(28, 31, 30, 29, 32);
        assertEquals(150, new School().getNumberOfStudents(headcounts));
    }

    @Test
    void testGetNumberOfStudents() {
        List<Integer> headcounts = Arrays.asList(31, 28, 29, 25, 32, 33, 26, 27);
        School school = new School();
        int expected = school.getNumberOfStudents(headcounts);

        assertEquals(231, expected);
    }
}