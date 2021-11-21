package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Operations {
    public List<String> readFile() throws IOException {
        return Files.readAllLines(Paths.get("src/main/resources/underground.txt"));
    }

    public String getDailySchedule(List<String> lines) {
        List<String> schedule = new ArrayList<>();
        for (String line : lines) {
            if (line.charAt(0) == '2') {
                schedule.add(line);
            }
        }
        return String.format("%tF, %s", new Date(), String.join(" ", schedule));
    }
}
