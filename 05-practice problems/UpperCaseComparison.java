import java.util.Scanner;

public class UpperCaseComparison {

    // b. Method to convert text to uppercase using charAt() and ASCII logic
    public static String convertToUpperCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // If lowercase letter, convert to uppercase
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // ASCII difference
            }

            result = result + ch;
        }

        return result;
    }

    // c. Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. User input
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // User-defined uppercase conversion
        String customUpper = convertToUpperCase(text);

        // Built-in uppercase conversion
        String builtInUpper = text.toUpperCase();

        // Compare both strings
        boolean result = compareStrings(customUpper, builtInUpper);

        // Display results
        System.out.println("\nUppercase using charAt(): " + customUpper);
        System.out.println("Uppercase using toUpperCase(): " + builtInUpper);
        System.out.println("Are both results same? " + result);

        sc.close();
    }
}
