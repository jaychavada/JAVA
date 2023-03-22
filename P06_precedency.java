public class P06_precedency {
    public static void main(String[] args) {
        int a = 64/8*6-10;
        /* 
        highest precedency is / then * from left to right
        * = 8*6-10
        * = 48 - 10
        * = 38
        */
        // Precedence and Associativity
        int b = 64*8/6-10;
        /* 
        highest precedency is * then / from left to right
         * = 512 / 6 -10
         * = 85.33 -10
         * = 75.33
        */
        System.out.println(a);
        System.out.println(b);

        
    }
}
