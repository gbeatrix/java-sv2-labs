package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {
    Words words;

    @BeforeEach
    void initWords(){
        words = new Words();
        words.addWord("kar");
        words.addWord("karabiner");
        words.addWord("karabély");
        words.addWord("karakter");
        words.addWord("karakán");
        words.addWord("láb");
        words.addWord("fej");
        words.addWord("has");
        words.addWord("hát");
    }

    @Test
    void testGetWordsStartWith(){
        List<String> expectedWords = Arrays.asList("kar", "karabiner", "karabély", "karakter", "karakán");
        words.getWordsStartWith("kar");
        assertEquals(expectedWords, words.getWords());
    }

    @Test
    void testGetWordsWithLength(){
        List<String> expectedWords = Arrays.asList("kar", "láb", "fej", "has", "hát");
        words.getWordsWithLength(3);
        assertEquals(expectedWords, words.getWords());
    }
}