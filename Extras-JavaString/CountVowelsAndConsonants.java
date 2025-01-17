
import java.util.Scanner;
public class CountVowelsAndConsonants {
	// This Method throw counts the number of vowels and consonants
	public static void countVowelsAndConso(String string, int count1, int count2){
		
		// In this loop check the number of vowels present in string
		for(int i=0; i < string.length(); i++){
			if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u'){
				count1++;
			}
			else{
				count2++;
			}
		}
		
		// Display the outputs
		System.out.println("Total number of vowels in String is: " + count1);
		System.out.println("Total number of Consonants in String is: " + count2);
	}
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		// Take the user inputs
		System.out.print("Enter the an string: ");
		String string = input.nextLine().trim();
		string.toLowerCase();
		int count1=0, count2=0;
		countVowelsAndConso(string, count1, count2);
		input.close();
		
	}
}