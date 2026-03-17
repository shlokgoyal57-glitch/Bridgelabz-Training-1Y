package StringPracties;

import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int[] freq = new int[256];


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }


        int max = -1;
        char mostFrequent = ' ';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] > max) {
                max = freq[ch];
                mostFrequent = ch;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}

