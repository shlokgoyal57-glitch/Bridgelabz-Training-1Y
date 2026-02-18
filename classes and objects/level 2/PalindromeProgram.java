package com.gla.ObjectsClasses.level1.level02;
import java.util.Scanner;

class PalindromeChecker {
    String text;

    void setText(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return text.equalsIgnoreCase(reversed);
    }

    void displayResult() {
        if (isPalindrome())
            System.out.println("The text is a Palindrome.");
        else
            System.out.println("The text is NOT a Palindrome.");
    }
}

public class PalindromeProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = sc.nextLine();

        PalindromeChecker pc = new PalindromeChecker();
        pc.setText(input);
        pc.displayResult();
    }
}

