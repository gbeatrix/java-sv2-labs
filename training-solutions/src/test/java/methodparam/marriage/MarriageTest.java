package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MarriageTest {
    @Test
    void testMarriage(){
        Man man = new Man("Gipsz Jakab");
        Woman woman = new Woman("Major Anna");
        new Marriage().getMarried(woman, man);

        assertEquals("Gipszné Anna", woman.getName());
        assertEquals(1, man.getRegisterDates().size());
        assertEquals("házasságkötés ideje", woman.getRegisterDates().get(0).getDescription());
        assertEquals(LocalDate.now(), man.getRegisterDates().get(0).getDate());
    }

    @Test
    void testMarriageInvalidData(){
        Marriage marriage = new Marriage();
        IllegalArgumentException err = assertThrows(IllegalArgumentException.class,
                () -> marriage.getMarried(null, null));
        assertEquals("Bride or groom is missing.", err.getMessage());
    }
}
