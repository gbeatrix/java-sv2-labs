package collectionsclass;

import java.util.Comparator;

public class ExamResult {
    private String name;
    private int points;

    public ExamResult(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return name + " (" + points + ')';
    }

    public static class CompareByResult implements Comparator<ExamResult> {
        @Override
        public int compare(ExamResult o1, ExamResult o2) {
            return o1.points - o2.points;
        }
    }
}
