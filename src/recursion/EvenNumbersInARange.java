package recursion;

public class EvenNumbersInARange {
    public static void main(String[] args) {
        printEvens(0, 10); // Example range
        System.out.println();
        printEvens(1, 11); // Example range
    }

    public static void printEvens(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            else {
                start += 1;
            }
        }
    }
}
