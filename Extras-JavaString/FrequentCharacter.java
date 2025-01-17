import java.util.Scanner;
public class FrequentCharacter{
    // Method to find the most frequent character
    public static char mostFrequentChar(String str) {
        // Create a character array from the string
        int[] charCount = new int[256];
        // Using for loop store the character counts
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }
        int maxCount = 0;
        char maxChar = ' ';
        // Using for loop find the maximum count and the corresponding character
        for (int i = 0; i < 256; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                maxChar = (char) i;
            }
        }
        return maxChar;


    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get the string from the user
        System.out.println("Enter the String:-");
        String str = input.nextLine().trim();

        // Call a Method and Display the most frequent character
        char result = mostFrequentChar(str);
        System.out.println("Most Frequent Character: " + result);

        input.close();

    }
}