import java.util.Scanner;

public class CharacterFrequency4 {

    public static String[][] findCharacterFrequency(String text) {
        int[] charFrequency = new int[256]; // Assuming ASCII characters

        // Calculate character frequencies
        for (int i = 0; i < text.length(); i++) {
            charFrequency[text.charAt(i)]++;
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[text.length()][2]; 
        int index = 0;

        // Store characters and frequencies in the result array
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); 
                result[index][1] = String.valueOf(charFrequency[i]);
                index++;
            }
        }

        // Resize the result array to the actual number of unique characters
        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the an string sentence: ");
        String sentence = scanner.nextLine().trim();

        String[][] result = findCharacterFrequency(sentence);

        System.out.println("Character Frequencies:");
        for (String[] entry : result) {
            System.out.println(entry[0] + " : " + entry[1]);
        }
		
		scanner.close();
    }
}