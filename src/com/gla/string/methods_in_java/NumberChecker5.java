package methods_in_java;
import java.util.Scanner;
public class NumberChecker5 {
    public static boolean isPerfect(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }
    public static boolean isAbundant(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum > n;
    }
    public static boolean isDeficient(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum < n;
    }
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
    public static boolean isStrong(int n) {
        int temp = n;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Perfect Number: " + NumberChecker5.isPerfect(num));
        System.out.println("Abundant Number: " + NumberChecker5.isAbundant(num));
        System.out.println("Deficient Number: " + NumberChecker5.isDeficient(num));
        System.out.println("Strong Number: " + NumberChecker5.isStrong(num));

    }
}