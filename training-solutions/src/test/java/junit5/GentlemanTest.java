package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GentlemanTest {
    @Test
    void testGentleman() {
        // Given
        Gentleman gentleman = new Gentleman();

        // When
        String result = gentleman.sayHello("John Doe");

        // Then
        assertEquals("Hello John Doe", result);

        /*
        Hibás program:
        org.opentest4j.AssertionFailedError:
        Expected :Hello John Doe
        Actual   :HelloJohn Doe

        Hibás teszteset:
        org.opentest4j.AssertionFailedError:
        Expected :Hello John Doe
        Actual   :Hello Jane Doe
         */
    }

    @Test
    void testAnonymous() {
        // Given
        Gentleman gentleman = new Gentleman();

        // When
        String result = gentleman.sayHello(null);

        // Then
        assertEquals("Hello Anonymous", result);
    }
}
