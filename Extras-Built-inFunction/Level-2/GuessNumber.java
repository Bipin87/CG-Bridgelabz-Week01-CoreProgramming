import java.util.Scanner;

public class GuessNumber {
    
    // Function to generate a random guess between min and max
    public static int generateGuess(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);  // Correcting the random guess generation
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minimum = 1, maximum = 100, guess = 0, attempts = 0;
        boolean result = false;

        // Game loop continues until the correct guess is made
        while (!result) {
            guess = generateGuess(minimum, maximum);
            System.out.println("Is your number " + guess + "?");
            System.out.println("Enter 'h' for high, 'l' for low, or 'c' for correct.");

            String feedback = scanner.next().trim().toLowerCase();  // Ensure case-insensitivity and avoid extra spaces

            // Handling user feedback
            if (feedback.equals("h")) {
                maximum = guess - 1;  // Guess is too high, adjust the max value
            } else if (feedback.equals("l")) {
                minimum = guess + 1;  // Guess is too low, adjust the min value
            } else if (feedback.equals("c")) {
                result = true;  // The guess is correct, exit the loop
                System.out.println("I've got it! The number was " + guess + ".");
                System.out.println("It took " + attempts + " attempts to guess your number.");
            } else {
                System.out.println("Invalid input. Please enter 'h', 'l', or 'c'.");
                continue;  // If invalid input, continue asking for feedback
            }

            attempts++;  // Increment the attempt counter after each guess
        }

        scanner.close();  
    }
}
