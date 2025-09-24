import java.util.*;

public class StudentScorecard {

    // Generate random marks for PCM
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                scores[i][j] = 40 + rand.nextInt(61); // scores between 40-100
        return scores;
    }

    // Calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3]; // total, avg, %, rounded
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            results[i][0] = Math.round(total);
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return results;
    }

    // Display scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\t%\n");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < 3; j++) System.out.print(scores[i][j] + "\t");
            for (int j = 0; j < 3; j++) System.out.print(results[i][j] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
}