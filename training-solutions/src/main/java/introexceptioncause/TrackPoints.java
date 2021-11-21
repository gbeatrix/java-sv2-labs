package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TrackPoints {
    public List<String> readData() {
        List<String> contents;
        try {
            contents = Files.readAllLines(Paths.get("src/main/resources/tracking.csv"));
        } catch (IOException err) {
            throw new IllegalArgumentException("Nem sikerült a fájl megnyitása.", err);
        }
        return contents;
    }

    public void writeData(List<String> contents) {
        try {
            int prev = Integer.parseInt(contents.get(0).split(";")[2]);
            for (int i = 1; i < contents.size(); i++) {
                int actual = Integer.parseInt(contents.get(i).split(";")[2]);
                System.out.println(actual - prev);
                prev = actual;
            }
        } catch (NumberFormatException err) {
            throw new IllegalArgumentException("Rosszul formázott adatok.", err);
        }
    }
}
