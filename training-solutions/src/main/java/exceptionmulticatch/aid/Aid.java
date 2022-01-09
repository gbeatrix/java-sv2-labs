package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {
    private int amount;

    public Aid(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public List<String> countAmountsOfAid(Path path) {
        try {
            List<String> content = Files.readAllLines(path);
            List<String> result = new ArrayList<>(content.size());
            for (String line : content) {
                String[] parts = line.split(": ");
                int population = Integer.parseInt(parts[1]);
                result.add("%s: %d".formatted(parts[0], amount / population));
            }
            return result;
        } catch (NullPointerException | IOException | IndexOutOfBoundsException | NumberFormatException | ArithmeticException err) {
            throw new IllegalStateException("Something went wrong while counting.", err);
        }
    }
}
