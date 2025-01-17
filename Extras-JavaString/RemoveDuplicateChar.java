import java.util.Scanner;
public class RemoveDuplicateChar{
	public static String removeDuplicates(String str) {     
        
		String newStr = "";
        // Traverse the input string
        for (char c : str.toCharArray()) {

            // Check if current character's present or not in newStr
            if (!newStr.contains(String.valueOf(c))) {
                
                //Concatinate the string
   				newStr = newStr + c;
                
            }
        }
		return newStr;
    }
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		// Take the user input 
		System.out.print("Enter the an String: ");
		String str = input.nextLine().trim();
		
		// Call a method
		String newStr = removeDuplicates(str);
		
		// Display the result
		System.out.println("Original String is: " + str);
		System.out.println(" Modified string is: " + newStr);
		
		input.close();
	}
}