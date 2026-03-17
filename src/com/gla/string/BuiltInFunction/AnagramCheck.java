package StringPracties;

import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter first string:");
        String str1 = sc.nextLine().replaceAll("\\s", "").toLowerCase();

        System.out.println("Enter second string:");
        String str2 = sc.nextLine().replaceAll("\\s", "").toLowerCase();


        if (str1.length() != str2.length()) {
            System.out.println("The strings are NOT anagrams.");
            return;
        }


        int[] freq1 = new int[26];
        int[] freq2 = new int[26];


        for (int i = 0; i < str1.length(); i++) {
            freq1[str1.charAt(i) - 'a']++;
        }


        for (int i = 0; i < str2.length(); i++) {
            freq2[str2.charAt(i) - 'a']++;
        }


        boolean isAnagram = true;
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }
    }
}

