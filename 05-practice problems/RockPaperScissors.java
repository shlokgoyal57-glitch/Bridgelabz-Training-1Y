import java.util.Scanner;

public class RockPaperScissors {

    // b. Method to get computer choice using Math.random()
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); // 0,1,2

        if (choice == 0)
            return "Rock";
        else if (choice == 1)
            return "Paper";
        else
            return "Scissors";
    }

    // c. Method to find the winner
    // Returns "Player", "Computer", or "Draw"
    public static String findWinner(String player, String computer) {

        if (player.equalsIgnoreCase(computer)) {
            return "Draw";
        }

        if ((player.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
            (player.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
            (player.equalsIgnoreCase("Scissors") && computer.equals("Paper"))) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    // d. Method to calculate wins, average, and percentage
    public static String[][] calculateStats(int playerWins, int computerWins, int totalGames) {

        String[][] stats = new String[2][3];

        double playerPercent = (playerWins * 100.0) / totalGames;
        double computerPercent = (computerWins * 100.0) / totalGames;

        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f", playerPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", computerPercent);

        return stats;
    }

    // e. Method to display results
    public static void displayResults(String[][] games, String[][] stats) {

        System.out.println("\nGame Results:");
        System.out.println("Game\tPlayer\t\tComputer\tWinner");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < games.length; i++) {
            System.out.println((i + 1) + "\t" + games[i][0] + "\t\t" +
                               games[i][1] + "\t\t" + games[i][2]);
        }

        System.out.println("\nWin Statistics:");
        System.out.println("Entity\t\tWins\tWin Percentage");
        System.out.println("----------------------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t\t" +
                               stats[i][1] + "\t" +
                               stats[i][2] + "%");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // f. User input
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        String[][] gameResults = new String[n][3];
        int playerWins = 0;
        int computerWins = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("\nGame " + (i + 1) + " - Enter your choice (Rock/Paper/Scissors): ");
            String playerChoice = sc.next();

            String computerChoice = getComputerChoice();
            String winner = findWinner(playerChoice, computerChoice);

            if (winner.equals("Player"))
                playerWins++;
            else if (winner.equals("Computer"))
                computerWins++;

            gameResults[i][0] = playerChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(playerWins, computerWins, n);
        displayResults(gameResults, stats);

        sc.close();
    }
}
