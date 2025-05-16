package recursion;

public class EvenNumbersInARange {
    public static void main(String[] args) {
        printEvens(0, 0); // Output: 0
        System.out.println();
        printEvens(0, 10); // Output: 0 2 4 6 8 10
        System.out.println();
        printEvens(1, 11); // Output: 2 4 6 8 10
    }

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
}
