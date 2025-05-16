package recursion;

/**
 * This recursive program returns all even numbers between start and end (inclusive).
 * @author E. Yap
 */
public class EvenNumbersInARange {
    /**
     * This method is a recursive function that prints all even numbers between start and end (inclusive).
     * @param start the starting integer of the range
     * @param end the ending integer of the range
     */
    public static void printEvens(int start, int end) {
        if (start > end) {
            return;
        }
        else if (start % 2 == 0) {
            System.out.print(start + " ");
            printEvens(start + 1, end);
        }
        else {
            printEvens(start + 1, end);
        }
    }

    /**
     * This main method tests the EvenNumbersInARange method with various inputs.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        printEvens(0, 0); // Output: 0
        System.out.println();
        printEvens(1, 1); // Output:
        System.out.println();
        printEvens(2, 1); // Output:
        System.out.println();
        printEvens(0, 10); // Output: 0 2 4 6 8 10
        System.out.println();
        printEvens(1, 11); // Output: 2 4 6 8 10
    }
}
