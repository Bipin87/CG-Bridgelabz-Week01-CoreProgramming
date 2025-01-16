import java.util.Scanner;

public class FirstNonRepeatingCharacter3 {
// method to find the first non-repeating character in a string
    private static char findFirstNonRepeatingCharacter(String text) {
        int[] frequencyArray = new int[256]; // Array to store character frequencies
        // Loop through the text to count character frequencies
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequencyArray[currentChar]++;
        }

        // Loop through the text to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequencyArray[currentChar] == 1) {
                return currentChar;
            }
        }

        // Return null character if no non-repeating character is found
        return '\0';
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the first non-repeating character
        char nonRepeatingChar = findFirstNonRepeatingCharacter(input);
        if (nonRepeatingChar != '\0') {
            System.out.println("The first non-repeating character is: " + nonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found.");
        }
		scanner.close();
    }
}
