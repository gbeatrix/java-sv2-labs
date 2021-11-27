package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {
    @Test
    void testVowels() {
        assertEquals(0, new Vowels().getNumberOfVowels(""));
        assertEquals(1, new Vowels().getNumberOfVowels("a"));
        assertEquals(0, new Vowels().getNumberOfVowels("b"));

        String word = "ÁRVÍZTŰRŐ tükörfúrógép";
        assertEquals(9, new Vowels().getNumberOfVowels(word));

        word = "Megszentségteleníthetetlenségeskedéseitekért";
        assertEquals(17, new Vowels().getNumberOfVowels(word));

        word = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(5, new Vowels().getNumberOfVowels(word));
    }
}