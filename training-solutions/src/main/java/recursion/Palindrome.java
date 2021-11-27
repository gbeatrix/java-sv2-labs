package recursion;

public class Palindrome {
    public boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        } else {
            return word.charAt(0) == word.charAt(word.length() - 1) && isPalindrome(word.substring(1, word.length() - 1));
        }
    }
}
