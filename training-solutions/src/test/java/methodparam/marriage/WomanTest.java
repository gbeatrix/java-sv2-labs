package methodparam.marriage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class WomanTest {
    Woman woman;

    @BeforeEach
    void init(){
        woman = new Woman("Major Anna");
    }

    @Test
    void testGetSetName() {
        woman.setName("Dr. " + woman.getName());
        assertEquals("Dr. Major Anna", woman.getName());
    }

    @Test
    void testAddGetRegisterDates() {
        woman.addRegisterDate(new RegisterDate("születés ideje", LocalDate.parse("1983-10-22")));
        woman.addRegisterDate(new RegisterDate("házasságkötés ideje", LocalDate.parse("2021-10-25")));
        assertEquals(2, woman.getRegisterDates().size());
        assertEquals("házasságkötés ideje", woman.getRegisterDates().get(1).getDescription());
        assertEquals("2021-10-25", woman.getRegisterDates().get(1).getDate().toString());
    }

    @Test
    void testCreateWomanInvalidName() {
        IllegalArgumentException err = assertThrows(IllegalArgumentException.class,
                () -> new Woman("  Ilona "));
        assertEquals("Name is invalid.", err.getMessage());
    }
}