package recursion;

public class ReverseAString {
        public static void reverse(String s) {
        if (s.isEmpty()) {
            return;
        } else {
            System.out.print(s.charAt(s.length() - 1));
            reverse(s.substring(0, s.length() - 1));
        }
    }
    public static void main(String[] args) {
        reverse(""); // Output:
        System.out.println();
        reverse("racecar"); // Output: racecar
        System.out.println();
        reverse("hello"); // Output: olleh
    }
}
