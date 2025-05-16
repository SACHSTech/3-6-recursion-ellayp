package recursion;

public class DecimalToBinary {
    public static String toBinary(int n) {
        if (n == 0) {
            return "";
        } else {
            return toBinary(n / 2) + (n % 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(toBinary(0)); // Output: ""
        System.out.println(toBinary(10)); // Output: "1010"
    }
}
