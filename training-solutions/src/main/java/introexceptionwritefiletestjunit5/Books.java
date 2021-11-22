package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Books {
    public void run(Path path) {
        List<String> contents;
        try {
            contents = Files.readAllLines(Paths.get("src/test/resources/books.txt"));
        } catch (IOException err) {
            throw new IllegalStateException("Hiba a fájl beolvasásakor.", err);
        }

        List<String> readable = new ArrayList<>();
        for (String line : contents) {
            String[] parts = line.split(";");
            readable.add(String.format("%s: %s", parts[2], parts[1]));
        }

        try {
            Files.write(path, readable);
        } catch (IOException err) {
            throw new IllegalStateException("Hiba a fájl létrehozásakor.", err);
        }
    }
}
