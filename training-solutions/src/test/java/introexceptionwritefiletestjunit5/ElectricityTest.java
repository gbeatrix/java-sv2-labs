package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElectricityTest {
    @TempDir
    File tempFolder;

    @Test
    void testWriteStreets() throws IOException {
        List<String> streets = new ArrayList<>(Arrays.asList("Bacsó Béla utca", "Bajcsy-Zsilinszky utca", "Bartók Béla utca", "Báthori utca", "Béke út", "Bem utca", "Bercsényi utca", "Bethlen Gábor utca", "Bocskai utca"));
        Electricity electricity = new Electricity(LocalDate.now(), streets);
        Path path = tempFolder.toPath().resolve("electricity.txt");
        electricity.writeStreets(path);

        List<String> contents = Files.readAllLines(path);
        streets.add(0, String.format("%tF", new Date()));
        assertEquals(streets, contents);
    }
}