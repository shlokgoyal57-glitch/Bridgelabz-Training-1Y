import java.util.Scanner;

public class CharacterTypeTable {

    // Method to check whether a character is Vowel, Consonant or Not a Letter
    public static String checkCharacter(char ch) {

        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if alphabet
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to create 2D array of character and its type
    public static String[][] findCharacterTypes(String str) {
        String[][] table = new String[str.length()][2];

        for (int i = 0; i < str.length(); i++) {
            table[i][0] = String.valueOf(str.charAt(i)); // character
            table[i][1] = checkCharacter(str.charAt(i)); // type
        }

        return table;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] table) {
        System.out.println("\nCharacter\tType");
        System.out.println("-------------------------");

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create 2D array
        String[][] result = findCharacterTypes(input);

        // Display result
        displayTable(result);

        sc.close();
    }
}
