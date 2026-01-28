import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true) {   // infinite loop
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            // check for exit condition
            if (num <= 0) {
                break;
            }

            sum = sum + num;
        }

        System.out.println("Sum of entered natural numbers = " + sum);
        sc.close();
    }
}
