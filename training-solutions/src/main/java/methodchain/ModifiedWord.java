package methodchain;

public class ModifiedWord {
    public String modify(String word){
        return word
                .toUpperCase().substring(0,1)
                .concat("x")
                .concat(word.toUpperCase().substring(2,3))
                .concat("y");
    }
}
