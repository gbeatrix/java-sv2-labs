package introexceptiontrycatch;

import java.util.Arrays;
import java.util.List;

public class FirstLetter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("alma", "banán", "citrom", "dinnye", "eper", "füge");
        try {
            for (String word : words) { // ha a words==null, akkor kivételt kapunk
                System.out.println(word.charAt(0)); // ha a word==null, akkor a charAt() hibát dob
            }
        } catch (NullPointerException err){
            System.out.println(err.getMessage());
        }
    }
}
