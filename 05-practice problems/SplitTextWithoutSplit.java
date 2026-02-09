import java.util.Scanner;

public class SplitTextWithoutSplit {

    // Method to find length of string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // stop counting
        }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] customSplit(String text) {
        int length = findLength(text);

        // Step 1: Count words (words = spaces + 1)
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Step 2: Store indexes of spaces
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        // Step 3: Extract words using indexes
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceIndexes.length; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[wordCount - 1] = text.substring(start);

        return words;
    }

    // Method to compare two String arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // User-defined split
        String[] customWords = customSplit(text);

        // Built-in split
        String[] builtInWords = text.split(" ");

        // Compare both results
        boolean result = compareArrays(customWords, builtInWords);

        // Display words
        System.out.println("\nWords using custom split:");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        // Display comparison result
        System.out.println("\nAre both results same? " + result);

        sc.close();
    }
}
