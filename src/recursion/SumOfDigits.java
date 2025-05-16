package recursion;

/**
 * This recursive program returns the sum of all digits in n
 * @author E. Yap
 */
public class SumOfDigits {
    /**
     * This method is a recursive function that calculates the sum of all digits in an integer n.
     * @param n the integer whose digits are to be summed
     * @return the sum of all digits in n
     */
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }

    /**
     * This main method tests the sumOfDigits method with various inputs.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println(sumOfDigits(0)); // Output: 0
        System.out.println(sumOfDigits(1234)); // Output: 10
    }
}
