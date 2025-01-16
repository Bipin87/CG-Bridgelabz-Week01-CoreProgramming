import java.util.Scanner;
public class VowelAndConsonantCount{
	// Method to convert uppercase case alphabets LowerCase letters
	public static char ConvertToLowerCase(char ch){
		// Value contains the result string after converted into the Lower case
		if(ch >= 'A'  && ch <= 'Z'){
			ch = (char) (ch + 32);
		}
		return ch;
	}
	
	//method to chek if the character is consonant, vowel or not a letter
	public static String checkCharacterType(char ch){
		
		ConvertToLowerCase(ch);
		
		// Check if character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        // Check if character is a consonant
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        // If not a letter, return "Not a Letter"
        else {
            return "Not a Letter";
        }
	}
	
	//method to count the number of vowel and consonants
	public static int[] countVowelConsonant(String str){
	
	//initalize variables to store the count of vowels and consonants
		int vowelCount = 0;
		int consonantCount = 0;
		
		//interate over the string
		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			
			//invoke checkCharacterType method to check if character is vowel, consonant or not a letter
			String temp = checkCharacterType(ch);
			
			
			// use .equals method
			if(temp.equals("Vowel")){
				vowelCount++;
			}
			else if(temp.equals("Consonant")){
				consonantCount++;
			}
		}
		
		//return a new array which contains the count of vowels and consonants
		return new int[]{vowelCount, consonantCount};
	}
	
	public static void main(String[] args){
		//create an instance of scanner class
		Scanner input = new Scanner(System.in);
		
		//get first string input from user
		System.out.println("Enter string: ");
		String str = input.nextLine().trim();
		
		int resultArr[] = countVowelConsonant(str);
		
		// Display the result
		System.out.println("Number of Vowels: " + resultArr[0]);
		System.out.println("Number of Consonants: " + resultArr[1]);
		//close scanner
		input.close();
		
	}
}