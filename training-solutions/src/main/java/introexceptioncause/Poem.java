package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Poem {
    public static void main(String[] args) {
        List<String> contents;
        try {
            contents = Files.readAllLines(Paths.get("src/main/resources/poem.txt"));
        } catch (IOException err) {
            throw new IllegalArgumentException("Hiba a fájl megnyitása során.", err);
        }
        for (String line : contents) {
            System.out.print(line.charAt(0));
        }
        System.out.println();
    }
}
