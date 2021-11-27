package recursion;

import java.util.Arrays;

public class Numbers {
    public int getSum(int[] numbers) {
        if (numbers.length > 0) {
            int[] rest = Arrays.copyOfRange(numbers, 1, numbers.length);
            return numbers[0] + getSum(rest);
        } else {
            return 0;
        }
    }
}
