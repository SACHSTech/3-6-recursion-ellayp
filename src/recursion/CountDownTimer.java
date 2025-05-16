package recursion;

public class CountDownTimer {
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

    public static void main(String[] args) {
        countDown(0); // Output:
        countDown(5); // Output: 5 4 3 2 1
    }
}