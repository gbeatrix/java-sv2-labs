package algorithmstransformation.letters;

import java.util.ArrayList;
import java.util.List;

public class TwoLetters {
    public List<String> getFirstTwoLetters(List<String> words) {
        List<String> result = new ArrayList<>(words.size());
        for (String word : words) {
            result.add(word.substring(0, 2));
        }
        return result;
    }
}
