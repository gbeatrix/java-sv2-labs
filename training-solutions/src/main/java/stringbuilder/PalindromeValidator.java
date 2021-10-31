package stringbuilder;

public class PalindromeValidator {
    public boolean isPalindrome(String word){
        StringBuilder sb = new StringBuilder(word).reverse();
        return sb.toString().equalsIgnoreCase(word);
    }

    public static void main(String[] args) {
        String notPalindrome = "Indul a görög aludni";
        String palindrome = notPalindrome.replace(" ","");
        PalindromeValidator palindromeValidator = new PalindromeValidator();
        System.out.println(palindromeValidator.isPalindrome(palindrome));
        System.out.println(palindromeValidator.isPalindrome(notPalindrome));
    }
}
