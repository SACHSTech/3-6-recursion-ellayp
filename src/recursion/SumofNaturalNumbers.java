package recursion;

public class SumofNaturalNumbers {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(1)); // Output: 1
        System.out.println(sum(5)); // Output: 15
    }
}
