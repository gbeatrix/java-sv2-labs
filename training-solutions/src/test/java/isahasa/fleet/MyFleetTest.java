package isahasa.fleet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyFleetTest {
    @Test
    void testFleet(){
        Fleet fleet = new Fleet();
        fleet.loadShip(10, 100);
        assertEquals(10, fleet.getWaitingPeople());
        assertEquals(100, fleet.getWaitingCargo());

        fleet.addShip(new Liner(25));
        fleet.loadShip(10, 100);
        assertEquals(0, fleet.getWaitingPeople());
        assertEquals(200, fleet.getWaitingCargo());

        fleet.addShip(new CargoShip(250));
        fleet.loadShip(10, 100);
        assertEquals(5, fleet.getWaitingPeople());
        assertEquals(50, fleet.getWaitingCargo());

        fleet.addShip(new FerryBoat(300, 30));
        fleet.loadShip(35, 260);
        assertEquals(10, fleet.getWaitingPeople());
        assertEquals(10, fleet.getWaitingCargo());
    }
}