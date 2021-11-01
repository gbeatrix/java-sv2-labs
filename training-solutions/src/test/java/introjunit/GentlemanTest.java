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
    }
}
