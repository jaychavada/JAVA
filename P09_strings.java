import java.util.Scanner;

public class P09_strings {
    public static void main(String[] args) {
        // String name = new String("jay");
        // /*
        // * we can also declare string like this.....
        // * String name = "jay";
        // */
        // System.out.print("The name is: ");
        // System.out.println(name);

        // int a = 6;
        // float b = 9.66f;
        // System.out.printf("The value of a is %d and value of b is %f", a, b);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter string");
            String str = sc.nextLine();
            System.out.println(str);
        }
    }
}
