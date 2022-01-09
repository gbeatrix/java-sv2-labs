package exceptionresource.siblings;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Siblings {
    public List<String> getFullNames(String lastName, Path path) {
        if (lastName == null) {
            throw new NullPointerException("Name is null");
        }
        if (path == null) {
            throw new NullPointerException("Path is null");
        }
        try (Scanner scanner = new Scanner(path)) {
            List<String> result = new ArrayList<>();
            while (scanner.hasNextLine()) {
                result.add(lastName + " " + scanner.nextLine());
            }
            return result;
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
    }
}
