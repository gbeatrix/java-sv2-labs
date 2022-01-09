package exceptions.sum;

public class NumbersSum {
    public int getSum(int[] numbers) {
        validateNumbers(numbers);
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public int getSum(String[] numbers) {
        validateNumbers(numbers);
        try {
            int[] arrayOfNumbers = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                arrayOfNumbers[i] = Integer.parseInt(numbers[i]);
            }
            return getSum(arrayOfNumbers);
        } catch (NumberFormatException err) {
            throw new IllegalArgumentException("number format error", err);
        }
    }

    private void validateNumbers(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null parameter");
        }
    }
}
