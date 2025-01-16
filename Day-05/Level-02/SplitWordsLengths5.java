import java.util.Scanner;

public class SplitWordsLengths5{

    // method to split the text into words without using split()
    private static String[] customSplit(String text) {
        int wordCount = countWords(text);
        int[] spaceIndexes = new int[wordCount - 1]; 
        int index = 0, spaceIndex = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndex++] = i;
            }
        }
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = (i < spaceIndexes.length) ? spaceIndexes[i] : text.length();
            words[i] = text.substring(start, end);
            start = end + 1;
        }

        return words;
    }

    // method to count the number of words in the text
    private static int countWords(String text) {
        int count = 1; // At least one word exists
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    // method to find the length of a string without using length()
    private static int findStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception indicates the end of the string
        }
        return count;
    }

    // Method to generate a 2D array with words and their lengths
    private static String[][] getWordsWithLengths(String[] words) {
        String[][] wordsWithLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordsWithLengths[i][0] = words[i];
            wordsWithLengths[i][1] = String.valueOf(findStringLength(words[i]));
        }
        return wordsWithLengths;
    }
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        // split the text into words using custom method
        String[] words = customSplit(userInput);
        // Generate the 2D array with words and their lengths
        String[][] wordsWithLengths = getWordsWithLengths(words);

        // Display the results in a tabular format
        System.out.println("Word\tLength");
        for (String[] entry : wordsWithLengths) {
            System.out.println(entry[0] + "\t" + Integer.parseInt(entry[1]));
        }

    }
}
