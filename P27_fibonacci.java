public class P27_fibonacci {
  public static int fibb1(int n) {
    if (n == 0 || n == 1) {
      return n;
    } else {
      return fibb1(n - 2) + fibb1(n - 1);
    }
  }

  public static void main(String[] args) {

    int fibonacci_len = 10;
    
    System.out.print("Fibonacci Series of " + fibonacci_len + " numbers is: \n");
    for (int i = 0; i < fibonacci_len; i++) {
      System.out.print(fibb1(i) + " ");
    }
  }
}