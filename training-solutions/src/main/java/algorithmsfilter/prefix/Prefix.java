package algorithmsfilter.prefix;

import java.util.ArrayList;
import java.util.List;

public class Prefix {
    public List<String> getWordsStartWith(List<String> words, String prefix){
        List<String> filtered = new ArrayList<>();
        for(String word : words){
            if(word.startsWith(prefix)){
                filtered.add(word);
            }
        }
        return filtered;
    }
}
