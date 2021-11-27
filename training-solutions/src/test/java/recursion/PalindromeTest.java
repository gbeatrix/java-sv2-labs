package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    void testPalindrome() {
        assertTrue(new Palindrome().isPalindrome(""));
        assertTrue(new Palindrome().isPalindrome("x"));
        assertFalse(new Palindrome().isPalindrome("no"));

        String word = "Indul a görög aludni.";
        assertFalse(new Palindrome().isPalindrome(word));

        word = "indulagörögaludni";
        assertTrue(new Palindrome().isPalindrome(word));
    }
}