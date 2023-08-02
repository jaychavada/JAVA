import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int input_number;
    public int noOfGuesses = 0;
    private Scanner sc;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random rand_number = new Random();
        this.number = rand_number.nextInt(100);
    }

    void takeuserinput() {
        System.out.println("Guess the Number ");
        sc = new Scanner(System.in);
        input_number = sc.nextInt();

    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (input_number == number) {
            System.out.format("You guessed it right number, it was %d\n you guessed it in %d attempts", number,
                    noOfGuesses);
            return true;
        } else if (input_number < number) {
            System.out.println("Too low.....");
        } else if (input_number > number) {
            System.out.println("Too high....");
        }
        return false;
    }
}

public class P33_exe3 {
    public static void main(String[] args) {
        Game shadow = new Game();
        boolean h = false;
        do {
            shadow.takeuserinput();
            h = shadow.isCorrectNumber();
            System.out.println(h);
        } while (!h);

    }
}
