package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student = new Student();

    @Test
    void testAddValidNote() {
        student.addNote(3);
        student.addNote(1);
        student.addNote(4);
        student.addNote(5);
        student.addNote(2);
        assertEquals(Arrays.asList(3, 1, 4, 5, 2), student.getNotes());
    }

    @Test
    void testAddInvalidNote() {
        IllegalArgumentException err = assertThrows(IllegalArgumentException.class,
                () -> student.addNote(3 / 4));
        assertEquals("Note must be between 1 and 5!", err.getMessage());

        assertThrows(IllegalArgumentException.class,
                () -> student.addNote(6));

        assertThrows(IllegalArgumentException.class,
                () -> student.addNote('5'));

        assertEquals(0, student.getNotes().size());
    }
}