package interfacedefaultmethods.cloth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableClothTest {
    @Test
    void testTableCloth(){
        double delta = 1e-5;
        Square tableCloth = new TableCloth(10.);
        assertEquals(10.0, tableCloth.getSide(), delta);
        assertEquals(4, tableCloth.getNumberOfSides());
        assertEquals(14.14213, tableCloth.getLengthOfDiagonal(), delta);
        assertEquals(40d, tableCloth.getPerimeter(), delta);
        assertEquals(1e2, tableCloth.getArea(), delta);
    }
}