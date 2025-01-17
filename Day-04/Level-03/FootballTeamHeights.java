import java.util.Random;

public class FootballTeamHeights {

    public static void main(String[] args) {
        int[] heights = new int[11]; // Array to store heights of 11 players

        // Generate random heights for players
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // Random height between 150 and 250 cms
        }

        // Find shortest, tallest, and mean height
        int shortest = findTheShortest(heights);
        int tallest = findTheTallest(heights);
        double mean = findTheMean(heights);

        // Display results
        System.out.println("Shortest  player height: " + shortest + " cms");
        System.out.println("Tallest player  height: " + tallest + " cms");
        System.out.println("Mean height of players: " + mean + " cms");
    }

    // Method to find the sum of all elements in the array
    public static int findTheSum(int[] arr) {
        int sum = 0;
        for (int height : arr) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height of the players
    public static double findTheMean(int[] arr) {
        return (double) findTheSum(arr) / arr.length;
    }

    // Method to find the shortest height of the players
    public static int findTheShortest(int[] arr) {
        int shortest = arr[0];
        for (int height : arr) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height of the players
    public static int findTheTallest(int[] arr) {
        int tallest = arr[0];
        for (int height : arr) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
}