import java.util.Scanner;

class MeanHeightOfPlayers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define an array to store heights of players
        double[] heights = new double[11];
        double sum = 0.0;

        // Take user input for the heights of the players in cm 
        System.out.println("Enter the heights of 11 football players (in cm):");
        for (int i = 0; i < 11; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            sum += heights[i]; // Add each height to the sum
        }

        // Calculate the mean heights of player 
        double mean = sum / 11;

        // Print the mean height of Football players
        System.out.println("The mean height of the football team is" + mean + " cm");

        input.close();
    }
}
