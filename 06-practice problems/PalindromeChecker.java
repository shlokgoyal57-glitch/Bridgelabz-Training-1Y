import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        String input = takeInput();

        boolean result = isPalindrome(input);

        displayResult(input, result);
    }

    // Function to take input
    public static String takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    // Function to check palindrome
    public static boolean isPalindrome(String str) {

        // Remove spaces and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // Function to display result
    public static void displayResult(String str, boolean result) {

        if (result) {
            System.out.println("\"" + str + "\" is a PALINDROME.");
        } else {
            System.out.println("\"" + str + "\" is NOT a palindrome.");
        }
    }
}
