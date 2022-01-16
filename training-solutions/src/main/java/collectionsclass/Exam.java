package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam {
    private final List<ExamResult> examResults;

    public Exam(List<ExamResult> examResults) {
        if (examResults == null) {
            throw new IllegalArgumentException("Parameter is null");
        }
        this.examResults = examResults;
    }

    public List<String> getNamesOfSucceededPeople(int places) {
        if (places > examResults.size()) {
            places = examResults.size();
        } else if (places < 0) {
            throw new IllegalArgumentException("Invalid number of places: " + places);
        }
        List<ExamResult> sorted = new ArrayList<>(examResults);
        sorted.sort(new ExamResult.CompareByResult());
        Collections.reverse(sorted);
        List<String> result = new ArrayList<>(places);
        for (int i = 0; i < places; i++) {
            result.add(sorted.get(i).getName());
        }
        return result;
    }
}
