package methodparam.marriage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ManTest {
    Man man;

    @BeforeEach
    void init(){
        man = new Man("Gipsz Jakab");
    }

    @Test
    void testGetSetName() {
        man.setName("Dr. " + man.getName());
        assertEquals("Dr. Gipsz Jakab", man.getName());
    }

    @Test
    void testAddGetRegisterDates() {
        man.addRegisterDate(new RegisterDate("születés ideje", LocalDate.parse("1983-10-22")));
        man.addRegisterDate(new RegisterDate("házasságkötés ideje", LocalDate.parse("2021-10-25")));
        assertEquals(2, man.getRegisterDates().size());
        assertEquals("házasságkötés ideje", man.getRegisterDates().get(1).getDescription());
        assertEquals("2021-10-25", man.getRegisterDates().get(1).getDate().toString());
    }

    @Test
    void testCreateManInvalidName() {
        IllegalArgumentException err = assertThrows(IllegalArgumentException.class,
                () -> new Man("  Sándor "));
        assertEquals("Name is invalid.", err.getMessage());
    }
}