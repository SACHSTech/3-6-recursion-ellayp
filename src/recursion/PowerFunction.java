package recursion;

public class PowerFunction {
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

    public static void main(String[] args) {
        System.out.println(power(5, 0)); // Output: 1
        System.out.println(power(2, 3)); // Output: 8
        System.out.println(power(-3, 4)); // Output: 81
        System.out.println(power(2, -1)); // Output: 0.5
    }
}
