package recursion;

/**
 * This recursive program returns the computed base to the power of exponent.
 * @author E. Yap
 */
public class PowerFunction {
    /**
     * This method is a recursive function that computes base to the power of exponent.
     * @param base the base integer
     * @param exponent the exponent integer
     * @return the computed base to the power of exponent
     */
    public static double power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            return (base * power(base, exponent - 1)); 
        }
        else {
            return (1 / power(base, -exponent));
        }
    }
    
    /**
     * This main method tests the PowerFunction method with various inputs.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println(power(5, 0)); // Output: 1
        System.out.println(power(2, 3)); // Output: 8
        System.out.println(power(-3, 4)); // Output: 81
        System.out.println(power(2, -1)); // Output: 0.5
    }
}
