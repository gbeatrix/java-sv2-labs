package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Words {
    public String getFirstWordWithA(Path path) {
        List<String> contents = readFile(path);
        for (String word : contents) {
            if (word.startsWith("A")) {
                return word;
            }
        }
        return "A";
    }

    private List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException err) {
            throw new IllegalStateException("Hiba a fájl megnyitása során.", err);
        }
    }
}
