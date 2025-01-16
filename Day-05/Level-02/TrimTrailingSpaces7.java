import java.util.Scanner;
public class TrailingSpaces7{
    // Method to find the start and end indices to trim leading and trailing spaces
    public static int[] findTrimPoints(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Trim leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        // Trim trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String customSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
	
		// 
        if (str1.length() != str2.length()) {
            return false;
        }
		
		//Iterating over the string 
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.println("Enter a string with leading and trailing spaces:");
        String inputText = scanner.nextLine();

        // initialize an array to store result from the user defined method
        int[] trimPoints = findTrimPoints(inputText);
        String trimmedCustom = customSubstring(inputText, trimPoints[0], trimPoints[1]);

        // Use built-in trim method for comparison
        String trimmedBuiltIn = inputText.trim();

        // Compare both strings and save their result in boolean variable
        boolean areEqual = compareStrings(trimmedCustom, trimmedBuiltIn);

        // output
        System.out.println("User defined trimmed string: '" + trimmedCustom + "'");
        System.out.println("Built-in trimmed string: '" + trimmedBuiltIn + "'");
        System.out.println("Are the two strings equal? " + areEqual);

        scanner.close();
	}
}
