import java.util.Scanner;
import java.util.Random;

public class StudentGradeCalculator {

    // a. Generate random 2-digit PCM scores for students
    public static int[][] generatePCMScores(int n) {
        int[][] scores = new int[n][3];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(90) + 10; // Physics
            scores[i][1] = rand.nextInt(90) + 10; // Chemistry
            scores[i][2] = rand.nextInt(90) + 10; // Maths
        }

        return scores;
    }

    // b. Calculate total, average, and percentage
    public static double[][] calculateStats(int[][] pcm) {
        double[][] stats = new double[pcm.length][3];

        for (int i = 0; i < pcm.length; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round off to 2 digits
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            stats[i][0] = total;
            stats[i][1] = average;
            stats[i][2] = percentage;
        }

        return stats;
    }

    // c. Calculate grade based on percentage
    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];

        for (int i = 0; i < stats.length; i++) {
            double percentage = stats[i][2];

            if (percentage >= 90)
                grades[i] = "A";
            else if (percentage >= 75)
                grades[i] = "B";
            else if (percentage >= 60)
                grades[i] = "C";
            else if (percentage >= 50)
                grades[i] = "D";
            else
                grades[i] = "F";
        }

        return grades;
    }

    // d. Display scorecard
    public static void displayScorecard(int[][] pcm, double[][] stats, String[] grades) {

        System.out.println("\nScorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < pcm.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                pcm[i][0] + "\t" +
                pcm[i][1] + "\t\t" +
                pcm[i][2] + "\t" +
                (int) stats[i][0] + "\t" +
                stats[i][1] + "\t" +
                stats[i][2] + "%\t\t" +
                grades[i]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] pcmScores = generatePCMScores(n);
        double[][] stats = calculateStats(pcmScores);
        String[] grades = calculateGrades(stats);

        displayScorecard(pcmScores, stats, grades);

        sc.close();
    }
}
