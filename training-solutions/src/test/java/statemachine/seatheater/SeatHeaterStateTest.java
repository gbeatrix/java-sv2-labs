package statemachine.seatheater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatHeaterStateTest {
    SeatHeaterState seatHeaterState;

    @Test
    void testSeatHeaterState(){
        seatHeaterState = seatHeaterState.OFF;
        assertSame(SeatHeaterState.OFF, seatHeaterState);
        assertSame(SeatHeaterState.THREE, seatHeaterState.next());
        seatHeaterState = seatHeaterState.next().next();
        assertSame(SeatHeaterState.TWO, seatHeaterState);
        assertSame(SeatHeaterState.ONE, seatHeaterState.next());
        assertSame(SeatHeaterState.OFF, seatHeaterState.next().next());
    }
}