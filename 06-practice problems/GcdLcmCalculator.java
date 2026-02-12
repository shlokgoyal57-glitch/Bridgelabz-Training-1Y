import java.util.Scanner;

public class GcdLcmCalculator {

    public static void main(String[] args) {

        int num1 = takeInput("Enter first number: ");
        int num2 = takeInput("Enter second number: ");

        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);

        displayResult(num1, num2, gcd, lcm);
    }

    // Function to take input
    public static int takeInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextInt();
    }

    // Function to calculate GCD using Euclidean Algorithm
    public static int calculateGCD(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // Function to calculate LCM
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    // Function to display result
    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}
