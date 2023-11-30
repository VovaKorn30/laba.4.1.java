public class Palindrome {
    public boolean isPalindrome(String word) {
        return word.replaceAll(" ", "").equalsIgnoreCase(new StringBuilder(word.replaceAll(" ", "")).reverse().toString());
    }

}
