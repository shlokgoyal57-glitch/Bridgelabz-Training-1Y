import java.util.Scanner;

public class FibonacciGenerator {

    public static void main(String[] args) {

        int terms = takeInput();

        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            generateFibonacci(terms);
        }
    }

    // Function to take input
    public static int takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        return sc.nextInt();
    }

    // Function to generate Fibonacci sequence
    public static void generateFibonacci(int n) {

        int first = 0, second = 1;

        System.out.println("Fibonacci Sequence:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
