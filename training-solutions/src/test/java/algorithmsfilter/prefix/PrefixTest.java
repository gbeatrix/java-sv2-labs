package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {
    @Test
    void testPrefix(){
        List<String> words = Arrays.asList("megír", "meglát", "elront", "rácsodálkozik", "megold");
        List<String> result = new Prefix().getWordsStartWith(words, "meg");
        assertEquals(3, result.size());
        assertTrue(result.contains("megold"));
        assertFalse(result.contains("elront"));
    }
}