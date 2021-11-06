package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {
    private List<String> words = new ArrayList<>();

    public List<String> getWords() {
        return words;
    }

    public void addWord(String word){
        words.add(word);
    }

    public void getWordsStartWith(String prefix){
        List<String> toRemove = new ArrayList<>();
        for(String word : words){
            if(!word.startsWith(prefix)){
                toRemove.add(word);
            }
        }
        words.removeAll(toRemove);
    }

    public void getWordsWithLength(int length){
        List<String> toRemove = new ArrayList<>();
        for(String word : words){
            if(word.length() != length){
                toRemove.add(word);
            }
        }
        words.removeAll(toRemove);
    }
}
