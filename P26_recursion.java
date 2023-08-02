class fact{
    int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    int factorial_iterative(int n) {
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
}

public class P26_recursion {
    // factorial(n) = n * n-1 *....1
    // factorial(n) = n * factorial(n-1)

    public static void main(String[] args) {
        // int h = 5;
        // System.out.println("The value of factorial n is:" + factorial(h));
        // System.out.println("The value of factorial n is:" + factorial_iterative(h));

        fact f = new fact();
        System.out.println("factorial is "+f.factorial(5));

        fact f1 = new fact();
        System.out.println("factorial using iterative is "+f1.factorial_iterative(5));
    }
}