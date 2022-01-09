package exceptionresource.hiddenword;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class HiddenWordTest {
    HiddenWord hiddenWord = new HiddenWord();

    @Test
    void testHiddenWord() {
        String actual = hiddenWord.getHiddenWord(Paths.get("src/test/resources/hiddenword.txt"));
        assertEquals("ALMA KÖRTE", actual);
    }

    @Test
    void testHiddenWordNoFile() {
        IllegalStateException err = assertThrows(IllegalStateException.class,
                () -> hiddenWord.getHiddenWord(null));
        assertEquals(NullPointerException.class, err.getCause().getClass());

        Path path = Paths.get("src/test/resources/hiddenword.txt_");
        err = assertThrows(IllegalStateException.class,
                () -> hiddenWord.getHiddenWord(path));
        assertTrue(err.getCause() instanceof IOException);
    }
}