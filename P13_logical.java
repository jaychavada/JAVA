public class P13_logical {
    public static void main(String[] args) {
        System.out.println("For_logical_AND...");
        boolean a = true;
        boolean b = true;
        if (a && b) {
            System.out.println("Y");
        } else
            System.out.println("N");

        System.out.println("For_logical_OR...");
        boolean a1 = true;
        boolean b1 = false;
        if (a1 || b1) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

        System.out.println("For_logical_NOT...");
        boolean a2 = true;
        boolean b2 = false;
        System.out.print("Not(a2) is: ");
        System.out.println(!a2);
        System.out.print("Not(b2) is: ");
        System.out.println(!b2);
    }
}