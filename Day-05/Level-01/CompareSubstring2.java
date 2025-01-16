import java.util.Scanner;
public class CompareSubstring2 {
	// CompareToStrings method to return boolean value
	public static boolean CompareToStrings(String text,String subString,int startIndex,int endIndex){
		
		return subString.equals(text.substring(startIndex,endIndex));
	}
	// CreateSubstring Method to create a substring 
	public static String CreateSubstring(String text, int startIndex,int endIndex){
		String subString = "";

		for(int i=startIndex; i < endIndex; i++){
			subString += text.charAt(i);
		}
		return subString;
		
	}
	public static void main(String [] args){
		// Take the user inputs
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String text = input.nextLine().trim();
		
		System.out.print("Enter the number of startIndex (startIndex < " + text.length() + "): ");
		int startIndex = input.nextInt();
		
		System.out.print("Enter the number of endIndex (endIndex < startIndex < "+text.length()+ "): " );
		int endIndex = input.nextInt();		
		

		String subString = CreateSubstring(text, startIndex,endIndex);	
		boolean result = CompareToStrings(text,subString, startIndex, endIndex);
		
		//Display the result
		System.out.println(result);
		// close the Scanner class
		input.close();
	}

}