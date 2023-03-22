public class P07_resulting_data_type {
    public static void main(String[] args) {
        /*
         * byte x = 5;
         * int y = 6;
         * short z = 8;
         * int a = y + z;
         * float b = 6.45f + x;
         * System.out.println(b);
         * System.out.println(a);
         * 
         */

        // Increment and decrement operators

        int i = 34;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        System.out.println(i--);
        System.out.println(i);
        System.out.println(--i);
        System.out.println(i);

        // QUICK QUIZ
        int y = 7;
        int x = ++y * 8;
        System.out.println(x);
    }
}
