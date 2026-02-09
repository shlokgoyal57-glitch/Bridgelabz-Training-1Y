import java.util.Scanner;

public class StringLengthWithoutMethod {

    // User-defined method to find string length
    public static int findLength(String str) {
        int count = 0;

        try {
            // Infinite loop
            while (true) {
                str.charAt(count); // Access character
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when index exceeds string length
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Calling user-defined method
        int customLength = findLength(input);

        // Calling built-in length() method
        int builtInLength = input.length();

        // Displaying results
        System.out.println("Length using user-defined method: " + customLength);
        System.out.println("Length using built-in length() method: " + builtInLength);

        sc.close();
    }
}
