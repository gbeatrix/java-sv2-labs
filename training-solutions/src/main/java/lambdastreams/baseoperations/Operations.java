package lambdastreams.baseoperations;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Operations {
    private List<Integer> integers;

    public Operations(List<Integer> integers) {
        this.integers = integers;
    }

    public Optional<Integer> min() {
        return integers.stream().min(Integer::compareTo);
    }

    public Integer sum() {
//        return integers.stream().mapToInt(i -> i).sum();
        return integers.stream().reduce(0, Integer::sum);
    }

    public boolean isAllPositive() {
        return integers.stream().allMatch(k -> k > 0);
    }

    public Set<Integer> getDistinctElements() {
        return integers.stream().collect(Collectors.toSet());
    }
}
