public class P59_try_catch_block {
    public static void main(String[] args) {
        int a = 6000;
        int b = 3;
        try {
            int c = a / b;
            System.out.println("The result is " + c);
        } catch (Exception e) {
            System.out.println("We failed to divide. the reason: ");
            System.out.println(e);
        }
        System.out.println("End of program");

    }
}