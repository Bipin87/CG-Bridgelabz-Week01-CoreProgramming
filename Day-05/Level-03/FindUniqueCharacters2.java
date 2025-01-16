import java.util.Scanner;
public class FindUniqueCharacters2 {
     // create Method to find the length of a string without using length() method
    private static int getLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string reached
        }
        return length;
    }

    // Method to find unique characters in a string
    private static char[] findUniqueCharacter(String text) {
        int length = getLength(text);
        char[] result = new char[length]; // Array to store unique characters
        int resultIndex = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character is already in the result array
            for (int j = 0; j < resultIndex; j++) {
                if (result[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // Add to result array if unique
            if (isUnique) {
                result[resultIndex++] = currentChar;
            }
        }

        // Trim the result array to fit the actual number of unique characters
        char[] uniqueChars = new char[resultIndex];
        System.arraycopy(result, 0, uniqueChars, 0, resultIndex);

        return uniqueChars;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char[] uniqueChars = findUniqueCharacter(input);
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            if (c != '\0') { 
                System.out.print(c + " ");
            }
        }
	scanner.close();
    }
}
