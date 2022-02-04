package skirental;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.Collator;
import java.util.*;

public class SkiRental {
    private Map<String, Equipment> rentals = new TreeMap<>(Collator.getInstance(new Locale("hu", "HU")));

    public Map<String, Equipment> getRentals() {
        return rentals;
    }

    public void loadFromFile(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                String name = parts[0];
                int sizeOfSkis = Integer.parseInt(parts[1].split(" ")[0]);
                int sizeOfBoot = Integer.parseInt(parts[1].split(" ")[1]);
                rentals.put(name, new Equipment(sizeOfSkis, sizeOfBoot));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file: " + path, e);
        }
    }

    public List<String> listChildren() {
        return rentals.entrySet().stream()
                .filter(entry -> entry.getValue().getSizeOfBoot() <= 37 && entry.getValue().getSizeOfSkis() <= 120)
                .map(Map.Entry::getKey)
                .toList();
    }

    public String getNameOfPeopleWithBiggestFoot() {
        return rentals.entrySet().stream()
                .filter(entry -> entry.getValue().getSizeOfBoot() != 0 && entry.getValue().getSizeOfSkis() != 0)
                .sorted(Comparator.comparing(Map.Entry::getKey, Collator.getInstance(new Locale("hu", "HU"))))
                .sorted(Comparator.comparing(entry -> entry.getValue().getSizeOfBoot(), Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }
}
