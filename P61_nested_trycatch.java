import java.util.Scanner;

public class P61_nested_trycatch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 58;
        marks[1] = 46;
        marks[2] = 30;
        boolean flag = true;
        while (flag) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter the value of index");
                int ind = sc.nextInt();
                try {
                    System.out.println("Welcome in try-catch");
                    try {
                        System.out.println(marks[ind]);
                        flag = false;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("This index is not exist");
                        System.out.println("Exception in level 2");
                    }
                } catch (Exception e) {
                    System.out.println("Exception in level 1");
                }
            }
            }
            System.out.println("Thank You");
        }
    }