package methods_in_java;
import java.util.Random;
import java.util.Scanner;

class StudentScores {

    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Maths
        Random rand = new Random();

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(41) + 60; // Physics: 60-100
            scores[i][1] = rand.nextInt(41) + 60; // Chemistry: 60-100
            scores[i][2] = rand.nextInt(41) + 60; // Maths: 60-100
        }
        return scores;
    }
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; // [total, average, percentage]

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Stu\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%d\t%.2f\t%.2f\n",
                    i + 1,
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    (int) results[i][0],
                    results[i][1],
                    results[i][2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();

        int[][] scores = generateScores(numStudents);

        double[][] results = calculateResults(scores);

        displayScorecard(scores, results);

    }
}