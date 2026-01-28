import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check whether the number is a natural number
        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            // Sum using For loop
            int FactorialFor = 1;
			for(int i=1;i<=n;i++){
			FactorialFor = FactorialFor*i
			}
			System.out.println("Factorial using For loop = " + FactorialFor);
			}
			}
			}