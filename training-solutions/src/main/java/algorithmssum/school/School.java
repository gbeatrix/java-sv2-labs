package algorithmssum.school;

import java.util.List;

public class School {
    public int getNumberOfStudents(List<Integer> headcounts) {
        int sum = 0;
        for (int headcount : headcounts) {
            sum += headcount;
        }
        return sum;
    }
}
