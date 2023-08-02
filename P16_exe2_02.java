import java.util.Scanner;
import java.util.Random;

public class P16_exe2_02 {

    public static void main(String[] args) {

        int userChoice, computerChoice;
        int rock, paper, scissors;
        try (Scanner input = new Scanner(System.in)) {

            rock = 0;
            paper = 1;
            scissors = 2;

            System.out.println("ROCK - PAPER - SCISSORRS GAME");
            System.out.println("Enter your choice (0=rock, 1=paper, 2=scissors)");
            // User input
            userChoice = input.nextInt();
            // if user chooses above 2
            while (userChoice > 2) {
                System.out.println("give number between 0 and 2");
                userChoice = input.nextInt();
            }
            // user selections
            if (userChoice == rock) {
                System.out.println("User chose ROCK");
            } else {
                if (userChoice == paper) {
                    System.out.println("User chose PAPER");
                } else {
                    System.out.println("User chose SCISSORS");
                }
            }

            // computer input (random)
            Random rnd = new Random();
            computerChoice = rnd.nextInt(3);

            // computer selection
            if (computerChoice == rock) {
                System.out.println("Computer chose ROCK");
            } else {
                if (computerChoice == paper) {
                    System.out.println("Computer chose PAPER");
                } else {
                    System.out.println("Computer chose SCISSORS");
                }
            }

            // Results section

            // Draw
            while (userChoice == computerChoice) {
                System.out.println("draw try again");

                // if user chooses above 2
                userChoice = input.nextInt();
                while (userChoice > 2) {
                    System.out.println("give number between 0 and 2");
                    userChoice = input.nextInt();
                }
                computerChoice = rnd.nextInt(3);
                // DRAW user selections
                if (userChoice == rock) {
                    System.out.println("User chose ROCK");
                } else {
                    if (userChoice == paper) {
                        System.out.println("User chose PAPER");
                    } else {
                        System.out.println("User chose SCISSORS");
                    }
                }
                // DRAW computer selection
                if (computerChoice == rock) {
                    System.out.println("Computer chose ROCK");
                } else {
                    if (computerChoice == paper) {
                        System.out.println("Computer chose PAPER");
                    } else {
                        System.out.println("Computer chose SCISSORS");
                    }
                }
            } // END DRAW

            // RESULTS
            if (computerChoice == rock) {
                if (userChoice == paper) {
                    System.out.println("User wins!");
                } else {
                    System.out.println("Computer Wins");
                }
            } else if (computerChoice == paper) {
                if (userChoice == rock) {
                    System.out.println("Computer wins");
                } else {
                    System.out.println("User Wins!");
                }
            } else if (userChoice == rock) {
                System.out.println("User Wins");
            } else {
                System.out.println("Computer Wins");
            }
        }

    }
}