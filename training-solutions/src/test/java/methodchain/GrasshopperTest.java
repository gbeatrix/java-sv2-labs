package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrasshopperTest {
    @Test
    void testHopOnce(){
        Grasshopper grasshopper = new Grasshopper();
        assertEquals(0, grasshopper.getPosition());

        assertSame(grasshopper, grasshopper.hopOnce(Direction.POSITIVE));
        assertEquals(1, grasshopper.getPosition());

        assertSame(grasshopper, grasshopper.hopOnce(Direction.NEGATIVE));
        assertEquals(0, grasshopper.getPosition());

        assertSame(grasshopper, grasshopper.hopOnce(null));
        assertEquals(0, grasshopper.getPosition());
    }

    @Test
    void testMoveFromZeroToThreeWithFiveHops(){
        Grasshopper grasshopper = new Grasshopper();
        assertEquals(0, grasshopper.getPosition());

        grasshopper.moveFromZeroToThreeWithFiveHops();
        assertEquals(3, grasshopper.getPosition());
    }
}