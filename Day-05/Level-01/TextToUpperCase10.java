import java.util.Scanner;

public class TextToUpperCase10 {

    // Method to convert lowercase alphabets to uppercase using charAt
    public static String convertToUpperCase(String text) {
        // Initialize a string to store the resultant uppercase string
        String result = "";

        // Iterate through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Convert lowercase letters (ASCII 97-122) to uppercase
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            } else {
                result += ch; // Append non-lowercase characters as is
            }
        }
        return result;
    }

    // Method to compare two strings character by character using charAt
    public static boolean compareStrings(String str1, String str2) {
        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character of both strings
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Create an instance of Scanner class for user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter the an string: ");
        String text = input.nextLine().trim();

        // Convert the string to uppercase using the custom method
        String customUpperCase = convertToUpperCase(text);

        // Convert the string to uppercase using the built-in method
        String builtInUpperCase = text.toUpperCase();

        // Compare the results of the custom and built-in methods
        boolean areEqual = compareStrings(customUpperCase, builtInUpperCase);

        // Display the results
        System.out.println("Custom method uppercase: " + customUpperCase);
        System.out.println("Built-in method uppercase: " + builtInUpperCase);

        if (areEqual) {
            System.out.println("Both methods produce the same result.");
        } else {
            System.out.println("The results are different.");
        }

        // Close the Scanner
        input.close();
    }
}
