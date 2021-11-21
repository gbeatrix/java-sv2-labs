package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Neptun {
    private List<String> readFile(Path path) throws IOException {
        return Files.readAllLines(path);
    }

    public static void main(String[] args) {
        try {
            List<String> contents = new Neptun().readFile(Paths.get("src/main/resources/neptun.csv"));
            List<String> neptunCodes = new ArrayList<>();
            for (String line : contents) {
                neptunCodes.add(line.split(",")[1]);
            }
            System.out.println(neptunCodes);
        } catch (IOException err) {
            System.out.println(err.getMessage());
        }
    }
}
