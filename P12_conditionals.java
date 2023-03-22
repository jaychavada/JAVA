import java.util.Scanner;

public class P12_conditionals {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Age: ");
        try (Scanner sc = new Scanner(System.in)) {
            age = sc.nextInt();

            // IF ELSE CONDITION.........
            // if (age >= 18) {
            // System.out.println("Yes you can drive");
            // } else {
            // System.out.println("You cannot drive!");
            // }

            // else condition......
            // if (age > 50) {
            // System.out.println("you are experienced");
            // } else if (age > 45) {
            // System.out.println("you are semi experienced");
            // } else {
            // System.out.println("not experienced");
            // }

            // switch case condition....
            switch (age) {
                case 18:
                    System.out.println("Going to become adult!");
                    break;
                case 23:
                    System.out.println("Going to join for job!");
                    break;
                case 60:
                    System.out.println("Going to retired");
                    break;
                default:
                    System.out.println("Enjoy life!");
            }
            System.out.println("Thanks for data");
        }
    }
}
