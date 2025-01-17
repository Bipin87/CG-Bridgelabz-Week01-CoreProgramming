import java.util.Scanner;
public class CompareTwoString1 {
	// CompareToString method to return boolean value
	public static boolean CompareToString(String text1,String text2){
		if(text1.length() != text2.length()){
			return false;
			
		}
		// for loop and charAt method to compare two string
		for(int i = 0; i < text1.length(); i++){
			if(text1.charAt(i) != text2.charAt(i)){
				return false;
			}
			
		}
		return true;
	}
	public static void main(String [] args){
		// Take the user inputs
		Scanner input = new Scanner(System.in);
		String text1 = input.nextLine().trim();
		String text2 = input.nextLine().trim();
		
		boolean result = CompareToString(text1,text2);
		// Built-in method equals
        boolean result1 = text1.equals(text2);		
		// Display the result
		System.out.println("Result by using Built in Method: " + result1);
		System.out.println("Result by using CharAt Method: " + result);
		
		// close the Scanner class
		input.close();
	}

}