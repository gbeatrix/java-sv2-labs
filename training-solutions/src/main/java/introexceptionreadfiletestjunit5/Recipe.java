package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private List<String> ingredients = new ArrayList<>();

    public List<String> getIngredients() {
        return ingredients;
    }

    public void addIngredients(Path path) {
        List<String> contents = readFile(path);
        for (int i = 2; i < contents.size(); i++) {
            ingredients.add(contents.get(i).split(" ")[2]);
        }
    }

    private List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException err) {
            throw new IllegalStateException("Hiba a fájl megnyitása során.", err);
        }
    }
}
