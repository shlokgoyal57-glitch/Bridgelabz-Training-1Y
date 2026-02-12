import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    static int low = 1;
    static int high = 100;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");
        System.out.println("----------------------------------");

        int guess;
        String feedback;

        while (true) {

            guess = generateGuess();
            System.out.println("Is your number: " + guess + " ?");
            System.out.print("Enter feedback (high / low / correct): ");

            feedback = getFeedback(sc);

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Yay! I guessed your number correctly!");
                break;
            }

            adjustRange(guess, feedback);
        }

        sc.close();
    }

    // Function to generate guess
    public static int generateGuess() {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }

    // Function to get user feedback
    public static String getFeedback(Scanner sc) {
        return sc.nextLine();
    }

    // Function to adjust guessing range
    public static void adjustRange(int guess, String feedback) {

        if (feedback.equalsIgnoreCase("high")) {
            high = guess - 1;
        } 
        else if (feedback.equalsIgnoreCase("low")) {
            low = guess + 1;
        }
    }
}
