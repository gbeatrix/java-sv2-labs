package exceptionmulticatch.converter;

public class BinaryStringConverter {
    public boolean[] binaryStringToBooleanArray(String data) {
        if (data == null) {
            throw new NullPointerException("Binary string is null.");
        }
        if (!data.matches("[01]*")) {
            throw new IllegalArgumentException("Binary string is not valid.");
        }
        boolean[] result = new boolean[data.length()];
        for (int i = 0; i < data.length(); i++) {
            result[i] = data.charAt(i) == '1';
        }
        return result;
    }

    public String booleanArrayToBinaryString(boolean[] arr) {
        if (arr == null) {
            throw new NullPointerException("Boolean array is null.");
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException("Boolean array is empty.");
        }
        StringBuilder sb = new StringBuilder(arr.length);
        for (boolean b : arr) {
            sb.append(b ? 1 : 0);
        }
        return sb.toString();
    }
}
