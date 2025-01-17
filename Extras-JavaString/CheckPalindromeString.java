import java.util.Scanner;
class CheckPalindromeString{
	// Method to check the original string is palindrome or not
	public static boolean palindromeStringCheck ( String str){
		String newStr = "";
		for( int i = 0; i < str.length(); i++){
			newStr = str.charAt(i) + newStr;
		}
		if (newStr.equals(str)){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		// Take user input string 
		System.out.print("Enter the string: ");
		String str = input.nextLine().trim();
		
		// Call the method
		boolean result = palindromeStringCheck(str);
		
		// Display the result
        if (result){
			System.out.println(" Input string is a Palindrome string: " + result);
		}		
		else {
			System.out.println(" Input string not a Palindrome string: " + result);
		}
		
		input.close();
	}
}