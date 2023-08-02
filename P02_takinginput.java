import java.util.Scanner;

public class P02_takinginput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Number 1");
            // int a = sc.nextInt();
            float a = sc.nextFloat();
            System.out.println("Enter Number 2");
            // int b = sc.nextInt();
            float b = sc.nextFloat();
            // int  sum = a+b;
            float  sum = a+b;
            System.out.println("Sum of the number is");
            System.out.println(sum);
      
            // FOR CHECKING VALIDITY OF USER INPUT DATA WE WILL USE sc.hasnext fun
            boolean b1 = sc.hasNextInt();
            System.out.println(b1);

            // String str = sc.next(); // for word reading
            String str = sc.nextLine(); // for full statement reading
            System.out.println(str);
        }
    }
}