package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DragonTest {
    @Test
    void testName(){
        Dragon dragon = new Dragon("Süsü", 1, 2.5);
        assertEquals("Süsü", dragon.getName());
        assertNotEquals("Samu", dragon.getName());
    }

    @Test
    void testNumberOfHeads(){
        Dragon dragon = new Dragon("Süsü", 1, 2.5);
        assertEquals(1, dragon.getNumberOfHeads());
        assertTrue(dragon.getNumberOfHeads() < 7);
        assertFalse(dragon.getNumberOfHeads() > 1);
    }

    @Test
    void testHeight(){
        Dragon dragon = new Dragon("Süsü", 1, 2.5);
        assertEquals(2.6, dragon.getHeight(), 0.15);
    }

    @Test
    void testNull(){
        Dragon dragon1 = new Dragon("Süsü", 1, 2.5);
        Dragon dragon2 = null;
        assertNotNull(dragon1);
        assertNull(dragon2);
    }

    @Test
    void testSameObjects(){
        Dragon dragon1 = new Dragon("Süsü", 1, 2.5);
        Dragon dragon2 = dragon1;
        assertSame(dragon1, dragon2);
    }

    @Test
    void testNotSameObjects(){
        Dragon dragon1 = new Dragon("Süsü", 1, 2.5);
        Dragon dragon2 = new Dragon("Süsü", 1, 2.5);
        assertNotSame(dragon1, dragon2);
    }
}
