public class first {
    public static void main(String[] args) {

        System.out.println("hello world");
        String s1 = new String("arun");
        // char[] s2 = {'a','r','u','n'} ;
        String s3 = new String("arun");
        
        if(s1.equals(s3)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

        if(s1 == s3){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
