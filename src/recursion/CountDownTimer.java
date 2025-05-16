package recursion;

/**
 * This recursive program returns numbers from n down to 1.
 * @author E. Yap
 */
public class CountDownTimer {
    /**
     * This method is a recursive function that prints numbers from n down to 1.
     * @param n the starting integer for the countdown
     */
    public static void countDown(int n) {
        // solution here
        if (n <= 0) {
            return;
        }
        else {
            System.out.print(n + " ");
            countDown(n - 1);
        }
    }

    /**
     * This main method tests the CountDownTimer method with various inputs.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        countDown(0); // Output:
        countDown(5); // Output: 5 4 3 2 1
    }
}