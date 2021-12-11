package statemachine.typewriter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeWriterStateTest {
    TypeWriterState typeWriterState;

    @Test
    void testSeatHeaterState(){
        typeWriterState = TypeWriterState.LOWERCASE;
        assertSame(TypeWriterState.LOWERCASE, typeWriterState.next().next());
        assertSame(TypeWriterState.UPPERCASE, typeWriterState.next());
    }
}