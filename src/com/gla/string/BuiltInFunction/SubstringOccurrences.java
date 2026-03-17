package StringPracties;

import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the main string:");
        String mainStr = sc.nextLine();

        System.out.println("Enter the substring to find:");
        String subStr = sc.nextLine();

        int count = 0;
        int subLen = subStr.length();

        // Loop through the main string
        for (int i = 0; i <= mainStr.length() - subLen; i++) {
            String temp = mainStr.substring(i, i + subLen);

            if (temp.equals(subStr)) {
                count++;
            }
        }

        System.out.println("The substring occurs " + count + " times.");
    }
}
