import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {

    // a. Method to generate random 2-digit ages for n students
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // random 2-digit age (10–99)
        }

        return ages;
    }

    // b. Method to check voting eligibility
    // Returns 2D String array: {age, canVote}
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]); // store age

            // Validate age
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    // c. Method to display the 2D array in tabular format
    public static void displayResult(String[][] table) {
        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Generate random ages
        int[] ages = generateAges(n);

        // Check voting eligibility
        String[][] result = checkVotingEligibility(ages);

        // Display result
        displayResult(result);

        sc.close();
    }
}
