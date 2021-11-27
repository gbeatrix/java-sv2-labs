package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {
    List<String> data = Arrays.asList("egy", "kettő", "három", "négy");
    Word word = new Word();

    @Test
    void testTown(){
        assertTrue(word.containsLongerWord(data, "öt"));
        assertFalse(word.containsLongerWord(data, "egymillió"));
        assertTrue(word.containsLongerWord(data, "sok"));
        assertFalse(word.containsLongerWord(data, "rengeteg"));
        assertFalse(word.containsLongerWord(data, "nulla"));
    }
}