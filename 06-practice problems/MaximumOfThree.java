import java.util.Scanner;

public class MaximumOfThree {

    public static void main(String[] args) {

        // Take inputs
        int num1 = takeInput("Enter first number: ");
        int num2 = takeInput("Enter second number: ");
        int num3 = takeInput("Enter third number: ");

        // Find maximum
        int max = findMaximum(num1, num2, num3);

        // Display result
        displayResult(max);
    }

    // Function to take input
    public static int takeInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextInt();
    }

    // Function to calculate maximum
    public static int findMaximum(int a, int b, int c) {

        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }

    // Function to display result
    public static void displayResult(int max) {
        System.out.println("Maximum number is: " + max);
    }
}
