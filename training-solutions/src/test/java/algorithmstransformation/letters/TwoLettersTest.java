package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {
    @Test
    void testTwoLetters(){
        List<String> words = Arrays.asList("április", "június", "szeptember", "november");
        List<String> result = new TwoLetters().getFirstTwoLetters(words);
        assertEquals(4, result.size());
        assertEquals("áp", result.get(0));
        assertEquals("no", result.get(3));
    }
}