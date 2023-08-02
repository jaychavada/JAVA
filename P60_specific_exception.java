import java.util.Scanner;

public class P60_specific_exception {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 58;
        marks[1] = 46;
        marks[2] = 30;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the array index");
            int ind = sc.nextInt();

            System.out.println("Enter the number you want to divide the value with");
            int num = sc.nextInt();
            try {
                System.out.println("The value at array index entered is: " + marks[ind]);
                System.out.println("The value of array-value/number is:" + marks[ind] / num);
            } 
            catch (ArithmeticException e) {
                System.out.println("ArithmeticException occured!");
                System.out.println(e);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException occured!");
                System.out.println(e);
            }
            catch (Exception e) {
                System.out.println("Some other Exception occured!");
                System.out.println(e);
            }
        }
    }
}