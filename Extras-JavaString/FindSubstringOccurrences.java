import java.util.*;
public class FindSubstringOccurrences{
	// Method to find the count of subString Occurrences in String 
	public static int subStringOccurrences( String string, String subString){
		int index=subString.length(), count = 0;
		for( int i = 0; i <= string.length() - subString.length(); i++){
			if(string.substring(i, i + index).equalsIgnoreCase(subString)){
				count++;
			}
			
		}
		return count;
	}
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		// Take the user input 
		System.out.print("Enter the an String: ");
		String string = input.nextLine().trim();
		System.out.print("Enter the an Substring: ");
		String subString = input.nextLine().trim();
		
		// display the result
		System.out.println("Total Number of subString Occurrences is: " + subStringOccurrences(string, subString));
		
		input.close();
	}	
}