public class P28_CH07PS {
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    static void pattern2(int n) {
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int fib(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {
        // que 01...
        multiplication(5);

        // que 02...
        pattern1(5);

        // que 03...
        int c = sumRecursive(3);
        System.out.println("The sum of n natural number is:" + c);

        // que 04...
        pattern2(5);

        // que 05...
       int result = fib(7);
       System.out.println("nth term of fibonacci series is:" +result); 
    }
}