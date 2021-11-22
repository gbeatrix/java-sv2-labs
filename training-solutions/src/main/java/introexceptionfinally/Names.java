package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Names {
    public static void main(String[] args) {
        try {
            Names names = new Names();
            names.readFile(Paths.get("src/main/resources/names.txt"));
            names.readFile(Paths.get("src/main/resources/othernames.txt"));
            names.readFile(Paths.get("FileNotFound.txt"));
        } catch (IllegalStateException err) {
            System.out.println(err.getMessage());
            System.out.println(err.getCause().getMessage());
        }
    }

    private void readFile(Path path) {
        List<String> contents;
        try {
            contents = Files.readAllLines(path);
            System.out.println(getFirstDr(contents));
        } catch (IOException err) {
            throw new IllegalStateException("Hiba a fájl megnyitásakor", err);
        } finally {
            System.out.println("End of reading.");
        }
    }

    private String getFirstDr(List<String> names) {
        for (String name : names) {
            if (name.startsWith("dr")) {
                return name;
            }
        }
        return "";
    }
}
