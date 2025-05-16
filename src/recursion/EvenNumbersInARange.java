package recursion;

/**
 * This recursive program returns all even numbers between start and end (inclusive).
 */
public class EvenNumbersInARange {
    /**
     * This method is a recursive function that prints all even numbers between start and end (inclusive).
     * @param start the starting integer of the range
     * @param end the ending integer of the range
     */
    public static void printEvens(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (start == 0 && end == 0) {
                System.out.print(0);
            }
            else if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            else {
                start += 1;
            }
        }
    }
    /**
     * This main method tests the EvenNumbersInARange method with various inputs.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        printEvens(0, 0); // Output: 0
        System.out.println();
        printEvens(0, 10); // Output: 0 2 4 6 8 10
        System.out.println();
        printEvens(1, 11); // Output: 2 4 6 8 10
    }
}
