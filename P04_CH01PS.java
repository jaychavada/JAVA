import java.util.Scanner;

public class P04_CH01PS {
    public static void main(String[] args) {
        // que 01 .....
        // int a = 10;
        // int b = 20;
        // int c = 30;
        // int sum = a+b+c;
        // System.out.println(sum);

        // que 02....
        // float sub1= 95;
        // float sub2= 85;
        // float sub3= 75;
        // float cgpa = (sub1 + sub2 + sub3)/30;
        // System.out.println(cgpa);

        // que 03....
        // System.out.println("What is you name");
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println("Hello "+ name + " have a good day");

        // que 04.....
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the kilometers");
            float km = sc.nextFloat();
            float miles = (float) (0.621 * km);
            System.out.println(miles);
        }

        // que 05...
        // System.out.println("Enter your number");
        // Scanner sc = new Scanner(System.in);
        // System.out.println(sc.hasNextInt());
    }
}
