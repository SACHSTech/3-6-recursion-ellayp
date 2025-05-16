package recursion;

public class CheckIfAStringIsAPalindrome {
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

    public static void main(String[] args) {
        System.out.println(isPalindrome("")); // Output: true
                System.out.println(isPalindrome("a")); // Output: true
        System.out.println(isPalindrome("racecar")); // Output: true
        System.out.println(isPalindrome("hello")); // Output: false
    }
}
