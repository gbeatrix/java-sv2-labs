package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {
    @Test
    void testGentleman() {
        // Given
        Gentleman gentleman = new Gentleman();

        // When
        String result = gentleman.sayHello("John Doe");

        // Then
        assertEquals("Hello John Doe", result);
    }
}
