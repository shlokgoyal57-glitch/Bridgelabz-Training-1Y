package StringPracties;

import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        System.out.println("Enter the word to replace:");
        String oldWord = sc.next();

        System.out.println("Enter the new word:");
        String newWord = sc.next();

        String result = "";

        int i = 0;
        while (i < sentence.length()) {

            if (i + oldWord.length() <= sentence.length() &&
                    sentence.substring(i, i + oldWord.length()).equals(oldWord)) {
                result += newWord;
                i += oldWord.length();
            } else {
                result += sentence.charAt(i);
                i++;
            }
        }

        System.out.println("Modified sentence: " + result);
    }
}

