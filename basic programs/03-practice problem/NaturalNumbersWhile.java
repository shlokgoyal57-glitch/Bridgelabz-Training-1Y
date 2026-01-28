import java.util.Scanner;

public class NaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check whether the number is a natural number
        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            // Sum using while loop
            int sumWhile = 0;
            int i = 1;

            while (i <= n) {
                sumWhile = sumWhile + i;
                i++;
            }

            // Sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Display results
            System.out.println("Sum using while loop = " + sumWhile);
            System.out.println("Sum using formula   = " + sumFormula);

            // Compare results
            if (sumWhile == sumFormula) {
                System.out.println("Result is CORRECT. Both computations match.");
            } else {
                System.out.println("Result is INCORRECT. Both computations do not match.");
            }
        }

        sc.close();
    }
}
