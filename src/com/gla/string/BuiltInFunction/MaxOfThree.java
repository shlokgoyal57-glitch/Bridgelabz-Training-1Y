package BuiltInFunction;
import java.util.Scanner;

public class MaxOfThree {

    static int getNumber(Scanner sc) {
        System.out.print("Enter number: ");
        return sc.nextInt();
    }

    static int findMax(int a, int b, int c) {
        int max = a;

        if (b > max)
            max = b;

        if (c > max)
            max = c;

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = getNumber(sc);
        int num2 = getNumber(sc);
        int num3 = getNumber(sc);

        int maximum = findMax(num1, num2, num3);

        System.out.println("Maximum number is: " + maximum);
    }
}