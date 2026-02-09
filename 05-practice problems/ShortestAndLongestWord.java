import java.util.Scanner;

public class ShortestAndLongestWord {

    // Method to find length of string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // stops counting
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

        // Store indexes of spaces
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
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }

        return table;
    }

    // Method to find shortest and longest word indexes
    public static int[] findShortestAndLongest(String[][] table) {
        int minIndex = 0;
        int maxIndex = 0;

        int minLength = Integer.parseInt(table[0][1]);
        int maxLength = Integer.parseInt(table[0][1]);

        for (int i = 1; i < table.length; i++) {
            int currentLength = Integer.parseInt(table[i][1]);

            if (currentLength < minLength) {
                minLength = currentLength;
                minIndex = i;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxIndex = i;
            }
        }

        return new int[] { minIndex, maxIndex };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Split text
        String[] words = customSplit(text);

        // Create 2D array (word, length)
        String[][] wordTable = createWordLengthTable(words);

        // Find shortest and longest
        int[] result = findShortestAndLongest(wordTable);

        // Display result
        System.out.println("\nWords and their lengths:");
        System.out.println("Word\t\tLength");
        System.out.println("-------------------------");

        for (int i = 0; i < wordTable.length; i++) {
            System.out.println(wordTable[i][0] + "\t\t" + Integer.parseInt(wordTable[i][1]));
        }

        System.out.println("\nShortest Word: " + wordTable[result[0]][0]);
        System.out.println("Longest Word: " + wordTable[result[1]][0]);

        sc.close();
    }
}
