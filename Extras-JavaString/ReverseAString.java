import java.util.Scanner;
public class ReverseAString{
	//This Method throw reverse the original string 
	public static void reverseTheString(String string){
		String reverseStr = "";
		for(int i = 0; i < string.length(); i++){
			reverseStr = string.charAt(i) + reverseStr;
			
		}
		// Display the outputs
		System.out.println(" Reverse string is: " + reverseStr);
	}
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		// Take the user input 
		System.out.print("Enter the String: ");
		String string = input.nextLine().trim();
		
		// call a reverseTheString method 
		reverseTheString( string);
		input.close();
	}
}