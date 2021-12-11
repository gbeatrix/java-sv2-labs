package interfacedefaultmethods.seats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatTest {
    @Test
    void testSeat(){
        Seat car = new Car("Fiat", 4);
        Seat sportsCar = new SportsCar();
        Seat familyCar = new FamilyCar();

        assertEquals(4, car.getNumberOfSeats());
        assertEquals(2, sportsCar.getNumberOfSeats());
        assertEquals(5, familyCar.getNumberOfSeats());
    }
}