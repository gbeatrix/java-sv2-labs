package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {
    @Test
    void testGetFirstWordWithA(){
        String result = new Words().getFirstWordWithA(Paths.get("src/test/resources/words.txt"));
        assertEquals("Anna", result);
    }

    @Test
    void testNoWordExistsWithA(){
        String result = new Words().getFirstWordWithA(Paths.get("src/test/resources/otherwords.txt"));
        assertEquals("A", result);
    }

    @Test
    void testFileNotFound(){
        IllegalStateException err = assertThrows(IllegalStateException.class,
                () -> new Words().getFirstWordWithA(Paths.get("src/test/resources/testFileNotFound.txt")));
        assertEquals("Hiba a fájl megnyitása során.", err.getMessage());
    }
}