package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TankTest {
    Tank tank = new Tank();

    @Test
    void testModifyValidAngle() {
        tank.modifyAngle(50);
        assertEquals(50, tank.getAngle());
        tank.modifyAngle(-130);
        assertEquals(-80, tank.getAngle());
    }

    @Test
    void testModifyInvalidAngle() {
        IllegalArgumentException err = assertThrows(IllegalArgumentException.class,
                () -> tank.modifyAngle(3000));
        assertEquals("Nem tudom elforgatni a tank csövét.", err.getMessage());
        assertEquals(120, tank.getAngle());

        assertThrows(IllegalArgumentException.class,
                () -> tank.modifyAngle(-1000));
        assertEquals(-160, tank.getAngle());
    }
}