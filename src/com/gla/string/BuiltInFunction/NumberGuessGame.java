package BuiltInFunction;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int low = 1, high = 100;
        int guess;
        String feedback;

        System.out.println("Think of a number between 1 and 100");

        while (true) {

            guess = r.nextInt(high - low + 1) + low;
            System.out.println("Computer guess: " + guess);

            System.out.print("Enter feedback (high / low / correct): ");
            feedback = sc.next();

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Computer guessed correctly!");
                break;
            }
            else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            }
            else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            }
        }
    }
}