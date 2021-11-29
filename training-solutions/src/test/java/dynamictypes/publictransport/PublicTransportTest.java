package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {
    @Test
    void test() {
        PublicVehicle bus = new Bus(7, 17.4, "Ikarus");
        PublicVehicle tram = new Tram(4, 8.5, 2);
        PublicVehicle metro = new Metro(4, 7.34, 10);

        PublicTransport publicTransport = new PublicTransport();
        publicTransport.addVehicle(bus);
        publicTransport.addVehicle(tram);
        publicTransport.addVehicle(metro);

        assertEquals(3, publicTransport.getVehicles().size());
    }
}