package exceptionresource.hiddenword;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class HiddenWord {
    public String getHiddenWord(Path path) {
        try (Scanner scanner = new Scanner(path)) {
            StringBuilder sb = new StringBuilder();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                line = line.replaceAll("[0-9]+", "");
                if (line.length() == 1) {
                    sb.append(line);
                } else {
                    sb.append(" ");
                }
            }
            return sb.toString();
        } catch (IOException | NullPointerException e) {
            throw new IllegalStateException(e);
        }
    }
}
