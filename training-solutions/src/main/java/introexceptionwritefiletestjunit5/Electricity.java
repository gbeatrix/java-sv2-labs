package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {
    private List<String> streets = new ArrayList<>();

    public Electricity(LocalDate date, List<String> streets) {
        this.streets.add(date.toString());
        this.streets.addAll(streets);
    }

    public void writeStreets(Path path) {
        try {
            Files.write(path, streets);
        } catch (IOException err) {
            throw new IllegalStateException("Hiba a fájl létrehozásakor.", err);
        }
    }
}
