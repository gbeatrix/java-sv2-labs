package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PaulStreetBoys {
    private List<String> readFile() {
        List<String> contents = new ArrayList<>();
        try {
            contents = Files.readAllLines(Paths.get("src/main/resources/palutcaifiuk.txt"));
        } catch (IOException err) {
            System.out.println(err.getMessage());
        }
        return contents;
    }

    private void writeContents(List<String> contents) {
        for (String line : contents) {
            if (line.contains("Nemecsek")) {
                System.out.println(line.toLowerCase());
            } else {
                System.out.println(line);
            }
        }
    }

    public static void main(String[] args) {
        PaulStreetBoys psb = new PaulStreetBoys();
        psb.writeContents(psb.readFile());
    }
}
