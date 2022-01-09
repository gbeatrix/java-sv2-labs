package exceptionmulticatch.converter;

public class AnswerStat {
    private BinaryStringConverter converter;

    public AnswerStat(BinaryStringConverter converter) {
        this.converter = converter;
    }

    public boolean[] convert(String data) {
        try {
            return converter.binaryStringToBooleanArray(data);
        } catch (NullPointerException | IllegalArgumentException err) {
            throw new InvalidBinaryStringException(err);
        }
    }

    public int answerTruePercent(String answers) {
        boolean[] arr = convert(answers);
        int trues = 0;
        for (boolean istrue : arr) {
            trues += istrue ? 1 : 0;
        }
        return Math.round(100f * trues / arr.length);
    }
}
