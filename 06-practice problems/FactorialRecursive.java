import java.util.Scanner;

public class FactorialRecursive {

    public static void main(String[] args) {

        int number = takeInput();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = calculateFactorial(number);
            displayResult(number, result);
        }
    }

    // Function to take input
    public static int takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    // Recursive function to calculate factorial
    public static long calculateFactorial(int n) {

        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive case
        return n * calculateFactorial(n - 1);
    }

    // Function to display result
    public static void displayResult(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
