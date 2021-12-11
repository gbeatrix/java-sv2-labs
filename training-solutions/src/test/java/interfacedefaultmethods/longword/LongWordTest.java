package interfacedefaultmethods.longword;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LongWordTest {
    @Test
    void testLongWord() {
        String actual = new LongWord().getLongWord();
        String expected = "LONGWORD";
        assertEquals(expected, actual);
    }

    @Test
    void testReadFile() {
        List<String> actual = new LongWord().readFromFile(Paths.get("src/test/resources/longword.txt"));
        String expected = "LONGWORD";
        assertEquals(5, actual.size());
        for (int i = 0; i < actual.size(); i++) {
            assertEquals(expected.substring(i, i + 4), actual.get(i));
        }
    }

    @Test
    void testReadFileGivenWrongPath() {
        LongWord longWord = new LongWord();
        Path path = Paths.get("src/main/resources/longword.txt");
        IllegalStateException err = assertThrows(IllegalStateException.class,
                () -> longWord.readFromFile(path));
        assertEquals("Error reading file: src/main/resources/longword.txt", err.getMessage());
    }
}