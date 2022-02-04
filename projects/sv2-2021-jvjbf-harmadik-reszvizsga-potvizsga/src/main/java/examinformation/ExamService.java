package examinformation;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class ExamService {
    private Map<String, ExamResult> results = new TreeMap<>();
    private int maxTheory;
    private int maxPractice;

    public Map<String, ExamResult> getResults() {
        return results;
    }

    public void readFromFIle(Path path) {
        try (Scanner scanner = new Scanner(path)) {
            maxTheory = scanner.nextInt();
            maxPractice = scanner.nextInt();
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String name = line.split(";")[0];
                int theory = Integer.parseInt(line.split("((^.*;)|( ))")[1]);
                int practice = Integer.parseInt(line.split("((^.*;)|( ))")[2]);
                results.put(name, new ExamResult(theory, practice));
            }

        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot read file: " + path.toString().replace("/", "\\"), e);
        }
    }

    public int getTheoryMax() {
        return maxTheory;
    }

    public int getPracticeMax() {
        return maxPractice;
    }

    public List<String> findPeopleFailed() {
        return results.entrySet().stream()
                .filter(person -> person.getValue().getTheory() * 100d / maxTheory < 51 || person.getValue().getPractice() * 100d / maxPractice < 51)
                .map(Map.Entry::getKey)
                .toList();
    }

    public String findBestPerson() {
        return results.entrySet().stream()
                .filter(person -> person.getValue().getTheory() * 100d / maxTheory >= 51 && person.getValue().getPractice() * 100d / maxPractice >= 51)
                .max(Comparator.comparing(person -> person.getValue().getTheory() + person.getValue().getPractice()))
                .map(Map.Entry::getKey)
                .orElseThrow(() -> new IllegalArgumentException("Cannot find person who passed"));
    }
}
