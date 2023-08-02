import java.util.Random;
import java.util.Scanner;

public class P41_randomnum {
    public static void main(String[] args) {
        // System.out.println("===================================================");
        // System.out.println("Name: " + "Devansh Abhani");
        // System.out.println("Enrollment Number: " + "210210107017");
        // System.out.println("Date: " + new java.util.Date());
        // System.out.println("Practical: " + "05_01");
        // System.out.println("===================================================");
        // System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting value of the range: ");
        int start = Integer.parseInt(sc.nextLine());
        System.out.println("Enter ending value of the range: ");
        int end = Integer.parseInt(sc.nextLine());
        int numbers_generated = 20;
        randomNumberGeneration(start, end, numbers_generated);
        sc.close();
    }

    static void randomNumberGeneration(int start, int end, int numbers_generated) {
        Random r = new Random();
        System.out.println("The 20 random numbers genereated between " + start + " and " + end + " are as below.");
        while (numbers_generated > 0) {
            int i = r.nextInt(start, end);
            System.out.print(i + ",");
            numbers_generated--;
        }
    }
}