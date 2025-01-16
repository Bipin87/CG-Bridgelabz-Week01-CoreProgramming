import java.util.Scanner;

public class ConvertTheStringLowerCase9 {

    // Method to convert uppercase alphabets into lowercase letters
    public static String convertToLowerCase(String text) {
        // Result string after converting into lowercase
        String resultString = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Convert uppercase letters (ASCII 65-90) to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                resultString += (char) (ch + 32);
            } else {
                resultString += ch;
            }
        }
        return resultString;
    }

    // Method to compare two strings character by character
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
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter the an string: ");
        String text = input.nextLine().trim();

        // Convert to lowercase using the built-in method
        String lowerCaseUsingMethod = text.toLowerCase();

        // Convert to lowercase using the custom method
        String lowerCaseByMe = convertToLowerCase(text);

        // Compare the results of both methods
        boolean areEqual = compareStrings(lowerCaseUsingMethod, lowerCaseByMe);

        // Display the results
        System.out.println("Custom method result: " + lowerCaseByMe);
        System.out.println("Built-in method result: " + lowerCaseUsingMethod);

        if (areEqual) {
            System.out.println("Both methods produce the same result.");
        } else {
            System.out.println("The results are different.");
        }

        // Close the Scanner
        input.close();
    }
}
