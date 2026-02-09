import java.util.Scanner;

public class CompareStrings {

    // b. Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String s1, String s2) {

        // If lengths are different, strings are not equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Compare character by character
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. User input using next()
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Custom comparison
        boolean customResult = compareUsingCharAt(str1, str2);

        // Built-in comparison
        boolean builtInResult = str1.equals(str2);

        // Display results
        System.out.println("\nResult using charAt() method: " + customResult);
        System.out.println("Result using equals() method: " + builtInResult);

        // Final validation
        if (customResult == builtInResult) {
            System.out.println("Both results are SAME");
        } else {
            System.out.println("Results are DIFFERENT");
        }

        sc.close();
    }
}
