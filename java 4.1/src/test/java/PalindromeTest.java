import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
class PalindromeTest {
    @Test
    void isPalindrome() {
        Palindrome palindromeChecker = new Palindrome();

        assertTrue(palindromeChecker.isPalindrome("racecar"));
        assertTrue(palindromeChecker.isPalindrome("A man a plan a canal Panama"));
        assertTrue(palindromeChecker.isPalindrome("Was it a car or a cat I saw"));
        assertFalse(palindromeChecker.isPalindrome("hello"));
        assertFalse(palindromeChecker.isPalindrome("car"));
    }
}