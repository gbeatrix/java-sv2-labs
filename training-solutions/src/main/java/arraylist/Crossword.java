package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Crossword {
    public static void main(String[] args) {
        String[] arr = { "KULCS", "KÁLYHA", "LÓ", "AJTÓ", "CSERESZNYEFA", "TEJ", "FELHŐ", "CIPŐ", "MOSODA", "KÁVÉTEJSZÍN", "CITERA", "BABA" };
        List<String> words = Arrays.asList(arr);
        List<String> selectedWords = new ArrayList<>();

        for(String word : words) {
            if (word.length() == 6) {
                selectedWords.add(word);
            }
        }

        System.out.println(selectedWords);
    }
}
