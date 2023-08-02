import java.util.Scanner;

public class P03_exe1 {
    public static void main(String[] args) {
        float total = 0;
        System.out.println("CBSE PERCENTSGE");
        try (Scanner marks = new Scanner(System.in)) {
            System.out.println("Enter total marks of each subject");
            int total_marks = marks.nextInt();

            System.out.println("Enter marks of subject 1:");
            Float s1 = marks.nextFloat();
            total = total + s1;

            System.out.println("Enter marks of subject 2:");
            Float s2 = marks.nextFloat();
            total = total + s2;

            System.out.println("Enter marks of subject 3:");
            Float s3 = marks.nextFloat();
            total = total + s3;

            System.out.println("Enter marks of subject 4:");
            Float s4 = marks.nextFloat();
            total = total + s4;

            System.out.println("Enter marks of subject 5:");
            Float s5 = marks.nextFloat();
            total = total + s5;
            
            float finalmarks = total * 100 / (total_marks * 5);
            System.out.println("total percentage");
            System.out.println(finalmarks);
        }
    }
}
