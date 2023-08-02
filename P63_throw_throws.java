class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

public class P63_throw_throws {
// Example method that uses "throws" to throw a custom exception
    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
// Example method that uses "throw" to throw a custom exception
    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        try {
            // int c = divide(6, 0);
            // System.out.println(c);
            double a = area(6);
            System.out.println("Area is:" + a);

            System.out.println("Division is:" + divide(10, 0));
        } catch (Exception e) {
            System.out.println("Sorry! there is an Exception");
        }

    }
}