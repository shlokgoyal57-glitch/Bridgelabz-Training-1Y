import java.util.Scanner;

public class WordsAndLengths2D {

    // Method to find length of string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // exception stops the loop
        }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] customSplit(String text) {
        int length = findLength(text);

        // Count words
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndexes = new int[wordCount - 1];
        int idx = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }

        // Extract words
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceIndexes.length; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[wordCount - 1] = text.substring(start);

        return words;
    }

    // Method to create 2D array of word and its length
    public static String[][] createWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i]; // word
            table[i][1] = String.valueOf(findLength(words[i])); // length as String
        }

        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Custom split
        String[] words = customSplit(text);

        // Create 2D array
        String[][] result = createWordLengthTable(words);

        // Display result in tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("------------------------");

        for (int i = 0; i < result.length; i++) {
            int length = Integer.parseInt(result[i][1]); // convert String to Integer
            System.out.println(result[i][0] + "\t\t" + length);
        }

        sc.close();
    }
}
