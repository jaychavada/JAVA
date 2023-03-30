public class P26_recursion {
    // factorial(n) = n * n-1 *....1
    // factorial(n) = n * factorial(n-1)
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int factorial_iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        int h = 5;
        System.out.println("The value of factorial n is:" + factorial(h));
        System.out.println("The value of factorial n is:" + factorial_iterative(h));
    }
}