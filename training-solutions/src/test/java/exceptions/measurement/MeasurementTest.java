package exceptions.measurement;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {
    Measurement measurement = new Measurement();
    Path path = Path.of("src/test/resources/measurementdata.csv");

    @Test
    void testReadFileNotExisting() {
        path = Path.of("measurementdata.csv");
        IllegalStateException err = assertThrows(IllegalStateException.class,
                () -> measurement.readFromFile(path));
        assertEquals("error reading file", err.getMessage());
    }

    @Test
    void testReadFile() {
        List<String> contents = measurement.readFromFile(path);
        assertEquals(11, contents.size());
        assertEquals("2,12.4,John Doe,a", contents.get(1));
        assertEquals("9,12.4,", contents.get(10));
    }

    @Test
    void testMeasurement() {
        List<String> contents = measurement.readFromFile(path);
        List<String> errors = measurement.validate(contents);
        assertEquals(8, errors.size());
        assertEquals("2,12.4,John Doe,a", errors.get(0));
        assertEquals("9,12.4,", errors.get(7));
    }
}