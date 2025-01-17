
import java.util.*;
public class LongestWord{
	// longestWordInSentence method to find the longest Word
	public static String longestWordInSentence(String sentence) {
    // store the string words in string array
    String[] words = sentence.split(" "); // Split the sentence into words
    String longestWord = "";
    
	// By using for each loop to iterate the array
    for (String word : words) {
        if (word.length() > longestWord.length()) {
            longestWord = word;
        }
    }

    return longestWord;
}
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		// Take the user input 
		System.out.print("Enter the Sentence: ");
		String sentence = input.nextLine().trim();
		System.out.println("Longest word is: " + longestWordInSentence(sentence));
		
		input.close();
	}
}