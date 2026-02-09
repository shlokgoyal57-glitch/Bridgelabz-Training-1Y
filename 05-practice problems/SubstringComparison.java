import java.util.Scanner;

public class SubstringComparison {

    // b. Method to create substring using charAt()
    public static String customSubstring(String str, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result = result + str.charAt(i);
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
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Custom substring using charAt()
        String customSub = customSubstring(text, start, end);

        // Built-in substring
        String builtInSub = text.substring(start, end);

        // Compare both substrings
        boolean result = compareStrings(customSub, builtInSub);

        // Display result
        System.out.println("\nSubstring using charAt(): " + customSub);
        System.out.println("Substring using substring(): " + builtInSub);
        System.out.println("Are both substrings equal? " + result);

        sc.close();
    }
}
