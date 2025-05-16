package recursion;

/**
 * This recursive program returns the sum of numbers from 1 to n.
 * @author E. Yap
 */
public class SumofNaturalNumbers {
    /**
     * This method is a recursive function that calculates the sum of all natural numbers from 1 to n.
     * @param n the upper limit of the sum
     * @return the sum of all natural numbers from 1 to n
     */
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }

    /**
     * This main method tests the SumofNaturalNumbers method with various inputs.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println(sum(1)); // Output: 1
        System.out.println(sum(5)); // Output: 15
    }
}
