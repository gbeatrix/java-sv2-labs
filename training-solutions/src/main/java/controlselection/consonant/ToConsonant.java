package controlselection.consonant;

public class ToConsonant {
    public char convertToConsonant(char c){
        String vowels = "aeiou";
        if(vowels.contains((""+c).toLowerCase())){
            return (char)(c+1);
        }
        return c;
    }
}
