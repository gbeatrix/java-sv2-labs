package recursion;

public class Vowels {
    public int getNumberOfVowels(String word) {
        if (word.isEmpty()) {
            return 0;
        } else {
            String vowels = "aáeéiíoóöőuúüű";
            String rest = word.substring(1);
            if (vowels.indexOf(Character.toLowerCase(word.charAt(0))) >= 0) {
                return 1 + getNumberOfVowels(rest);
            } else {
                return getNumberOfVowels(rest);
            }
        }
    }
}
