package introjunit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GentlemanTest {
    @Test
    public void testGentleman(){
        // Given
        Gentleman gentleman = new Gentleman();

        // When
        String result = gentleman.sayHello("John Doe");

        // Then
        assertThat(result, equalTo("Hello John Doe"));

        /*
        Hibás program:
        java.lang.AssertionError:
        Expected: "Hello John Doe"
             but: was "Hi John Doe"
        Expected :Hello John Doe
        Actual   :Hi John Doe

        Hibás teszteset:
        java.lang.AssertionError:
        Expected: "Hello Jane Doe"
             but: was "Hello John Doe"
        Expected :Hello Jane Doe
        Actual   :Hello John Doe
         */
    }
}
