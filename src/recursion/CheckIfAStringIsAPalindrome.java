package recursion;

/**
 * This recursive program returns true if a string, s, is a palindrome.
 * @author E. Yap
 */
public class CheckIfAStringIsAPalindrome {
    /**
     * This method is a recursive function that checks if a string is a palindrome.
     * @param s the string to be checked
     * @return true if s is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }
        else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            isPalindrome(s.substring(1, s.length() - 1));
        }
        else {
            return false;
        }
        return true;
    }

    /**
     * This main method tests the CheckIfAStringIsAPalindrome method with various inputs.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println(isPalindrome("")); // Output: true
        System.out.println(isPalindrome("a")); // Output: true
        System.out.println(isPalindrome("racecar")); // Output: true
        System.out.println(isPalindrome("hello")); // Output: false
    }
}
