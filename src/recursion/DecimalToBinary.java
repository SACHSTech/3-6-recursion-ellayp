package recursion;

/**
 * This recursive program returns the binary representation of integer n as a string.
 * @author E. Yap
 */
public class DecimalToBinary {
    /**
     * This method is a recursive function that returns the binary representation of integer n as a string.
     * @param n the integer to be converted to binary
     * @return the binary representation of n as a string
     */
    public static String toBinary(int n) {
        if (n == 0) {
            return "0";
        } 
        if (n == 1) {
            return "1";
        }
        
        return toBinary(n / 2) + (n % 2);
    }

    /**
     * This main method tests the DecimalToBinary method with various inputs.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println(toBinary(0)); // Output: ""
        System.out.println(toBinary(10)); // Output: "1010"
    }
}
