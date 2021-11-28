package methodparam.sums;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SeparatedSum {
    public String readFile() {
        try {
            List<String> contents = Files.readAllLines(Paths.get("src/main/resources/floatingnumbers.txt"));
            return contents.get(0);
        } catch (IOException e) {
            throw new IllegalStateException("File not found.", e);
        }
    }

    public PairOfDoubles sum(String floatingNumbers) {
        String[] floats = floatingNumbers.replace(",", ".").split(";");
        PairOfDoubles pairOfDoubles = new PairOfDoubles();
        for (String floatString : floats) {
            pairOfDoubles.addNumber(Double.parseDouble(floatString));
        }
        return pairOfDoubles;
    }
}
