package recursion;

/**
 * This recursive program returns the reverse string of a string s.
 * @author E. Yap 
 */
public class ReverseAString {
    /**
     * This method is a recursive function that reverses a string.
     * @param s the string to be reversed
     */
        public static void reverse(String s) {
        if (s.isEmpty()) {
            return;
        } else {
            System.out.print(s.charAt(s.length() - 1));
            reverse(s.substring(0, s.length() - 1));
        }
    }
    /**
     * This main method tests the ReverseAString method with various inputs.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        reverse(""); // Output:
        System.out.println();
        reverse("racecar"); // Output: racecar
        System.out.println();
        reverse("hello"); // Output: olleh
    }
}
