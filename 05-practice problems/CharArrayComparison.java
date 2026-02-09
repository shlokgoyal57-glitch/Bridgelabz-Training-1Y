import java.util.Scanner;

public class CharArrayComparison {

    // b. Method to return characters without using toCharArray()
    public static char[] getCharacters(String str) {
        char[] chars = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }

        return chars;
    }

    // c. Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. User input using next()
        System.out.print("Enter a string: ");
        String text = sc.next();

        // User-defined method
        char[] customArray = getCharacters(text);

        // Built-in method
        char[] builtInArray = text.toCharArray();

        // Compare both arrays
        boolean result = compareCharArrays(customArray, builtInArray);

        // Display characters
        System.out.print("\nCharacters using user-defined method: ");
        for (char ch : customArray) {
            System.out.print(ch + " ");
        }

        System.out.print("\nCharacters using toCharArray(): ");
        for (char ch : builtInArray) {
            System.out.print(ch + " ");
        }

        // Display comparison result
        System.out.println("\n\nAre both character arrays equal? " + result);

        sc.close();
    }
}
