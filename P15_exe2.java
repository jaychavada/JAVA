// ROCK PAPER SCISSOR GAME


import java.util.Random;
import java.util.Scanner;

public class P15_exe2 {
    public static void main(String[] args) {
        // 0 for Rock....1 for Paper....2 for Scissor

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 0 for Rock....1 for Paper....2 for Scissor");
            int userinput = sc.nextInt();

            Random random_number = new Random();
            int computerInput = random_number.nextInt(0, 2);

            if (userinput == computerInput) {
                System.out.println("Draw");
            } else if (userinput == 0 && computerInput == 2 || userinput == 1 && computerInput == 0
                    || userinput == 2 && computerInput == 1) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer Win!");
            }
            if (computerInput == 0) {
                System.out.println("computer choice: Rock");
            } else if (computerInput == 1) {
                System.out.println("computer choice: Paper");
            } else if (computerInput == 2) {
                System.out.println("computer choice: Scissor");
            }
        }
    } 

}
