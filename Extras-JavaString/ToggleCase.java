import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String string = scanner.nextLine();

        // Toggle the case of the characters in the string
        String toggledString = toggleCase(string);

        // Display the result
        System.out.println("Toggled case string: " + toggledString);

        // Close the scanner
        scanner.close();
    }

    // Method to toggle the case of each character
    public static String toggleCase(String str) {
        StringBuilder toggled = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggled.append(Character.toUpperCase(ch));
            } else {
                toggled.append(ch); // Append non-alphabetic characters as is
            }
        }

        return toggled.toString();
    }
}
