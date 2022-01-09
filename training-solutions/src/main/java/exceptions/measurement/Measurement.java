package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {
    public List<String> readFromFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException err) {
            throw new IllegalStateException("error reading file", err);
        }
    }

    public List<String> validate(List<String> lines) {
        List<String> errors = new ArrayList<>();
        for (String line : lines) {
            String[] parts = line.split(",");
            if (parts.length != 3 || !validateOrdinal(parts[0]) || !validateMeasure(parts[1]) || !validateName(parts[2])) {
                errors.add(line);
            }
        }
        return errors;
    }

    private boolean validateOrdinal(String ordinal) {
        try {
            Integer.parseInt(ordinal);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean validateMeasure(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean validateName(String name) {
        return name.split(" ").length > 1;
    }
}
