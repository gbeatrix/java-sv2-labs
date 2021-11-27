package algorithmsdecision.words;

import java.util.List;

public class Word {
    public boolean containsLongerWord(List<String> words, String reference) {
        int len = reference.length();
        for (String word : words) {
            if (word.length() > len) {
                return true;
            }
        }
        return false;
    }
}
