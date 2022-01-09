package exceptionresource.siblings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SiblingsTest {
    Siblings siblings = new Siblings();
    Path path;
    @TempDir
    File tmp;

    @BeforeEach
    void init() throws IOException {
        path = tmp.toPath().resolve("names.txt");
        Files.write(path, Arrays.asList("Emese", "Ferenc"));
    }

    @Test
    void testSiblings() {
        List<String> actual = siblings.getFullNames("Szabó", path);
        List<String> expected = Arrays.asList("Szabó Emese", "Szabó Ferenc");
        assertEquals(expected, actual);
    }

    @Test
    void testSiblingsInvalidPath() {
        path = Paths.get("names.txt");
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> siblings.getFullNames("Szabó", path));
        assertEquals("Can not read file", ise.getMessage());
    }

    @Test
    void testNullArgs() {
        assertThrows(NullPointerException.class,
                () -> siblings.getFullNames("Szabó", null));

        assertThrows(NullPointerException.class,
                () -> siblings.getFullNames(null, path));
    }
}