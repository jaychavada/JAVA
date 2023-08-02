public class P64_finally_block {

    public static int greet() {
        try {
            int a = 26;
            int b = 0;
            int h = a / b;
            return h;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("End of the function");
        }
        return 0;
    }

    public static void main(String[] args) {
        int c = greet();
        System.out.println(c);
        int a = 10;
        int b = 5;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am Finally for value b: "+b);
            }
            b--;
        }
        try{
            System.out.println(10/5);
        }
        finally{
            System.out.println("Yes this is also finally");
        }
    }
}