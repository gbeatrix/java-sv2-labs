package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {
    private Ship ship;

    @BeforeEach
    void initShip(){
        ship = new Ship("Titanic", 1912, 882.6 * 0.3048);
    }

    @Test
    void testName(){
        assertEquals("Titanic", ship.getName());
        assertNotEquals("RMS Titanic", ship.getName());
    }

    @Test
    void testYearOfConstruction(){
        assertEquals(1912, ship.getYearOfConstruction());
        assertTrue(1900 <= ship.getYearOfConstruction());
        assertFalse(1900 > ship.getYearOfConstruction());
    }

    @Test
    void testLength(){
        assertEquals(269, ship.getLength(), 0.05);
        assertNotEquals(269, ship.getLength(), 0.01);
    }

    @Test
    void testNull(){
        Ship anotherShip = null;
        assertNull(anotherShip);
        assertNotNull(ship);
    }

    @Test
    void testSameObjects(){
        Ship anotherShip = ship;
        assertSame(anotherShip, ship);
    }

    @Test
    void testNotSameObjects(){
        Ship anotherShip = new Ship("Titanic", 1912, 882.6 * 0.3048);
        assertNotSame(anotherShip, ship);
    }
}