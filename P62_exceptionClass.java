import java.util.Scanner;

class myexception extends Exception{
    @Override
    public String toString(){
        return super.toString() +" "+"i am toString()";
    }
    @Override
    public String getMessage() {
        return super.getMessage()+" "+ "i am getMessage()";
    }
}
public class P62_exceptionClass {
    public static void main(String[] args) {
        int a;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of a");
            a = sc.nextInt();
        }
        if(a<99){
            try {
                // throw new myexception();
                throw new ArithmeticException("this is an exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace(); // for finding error in lines
            }
        }
       myexception m1 = new myexception();
       System.out.println(m1.toString()+m1.getMessage());
    }
}
