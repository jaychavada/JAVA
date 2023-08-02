import java.util.Scanner;

public class P08_CH02PS {
    public static void main(String[] args) {
        // que 01...
        // float a = 7 / 4 * 9 / 2;
        // System.out.println(a);

        // // que 02...
        // char grade = 'B';
        // // increase of 8 in grade
        // grade = (char) (grade + 8);
        // System.out.println(grade);
        // // decrease of 8 from grade
        // grade = (char) (grade - 8);
        // System.out.println(grade);

        // // que 03....
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number");
            int x = sc.nextInt();
            System.out.println(x > 8);
        }

        // que 04...
        // float v = 5;
        // float u = 4;
        // float w = (v * v - u * u) / (2 * 9 * 5);
        // System.out.println((w));

        //que 05...

        // int a = 7*49/7 + 35/7;
        // System.out.println(a);
    }
}