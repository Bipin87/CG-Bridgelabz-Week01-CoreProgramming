import java.util.Scanner;
public class CompareTwoArray{
	
	//method to return substring of a string
	public static char[] Character (String str, char[] str1){
	
		//use for loop to iterate the string
		for(int i = 0;  i < str.length(); i++){
			str1[i] += str.charAt(i);
		}
		return str1;
	}
	
	//method to compare arrays
	public static boolean CompareArray(char arrayFromBuiltIn[], char arrayFromMethod[], int length){
		for(int i = 0; i < length; i++){
			if(arrayFromBuiltIn[i] != arrayFromMethod[i]){
				return false;
			}
		}
		return true;
	}
	
	public static void PrintArray(char arrayFromBuiltIn[], int length){
		for(int i = 0; i <length; i++){
			System.out.print("Character of string are "+ arrayFromBuiltIn[i] +", ");
		}
	}
	public static void main(String[] args){
	
		//create an instance object of scanner class
		Scanner input = new Scanner(System.in);
		
		//Take first string input from the user
		System.out.print("Enter the first string: ");
		String str = input.next().trim();
		
		//initialize a array to store the resultant subString from method
		char arrayFromMethod[] = new char[str.length()];
		
		//call Character method to store the resultant character in array
		Character(str, arrayFromMethod);
		
		
		//initialize another array to store the result from built-in method
		char arrayFromBuiltIn[] = str.toCharArray();
		
		int length = str.length();
		
		boolean comapreResult = CompareArray(arrayFromBuiltIn, arrayFromMethod,length);
		
		if(comapreResult){
			System.out.println("Both arrays are equal");
		}
		else{
			System.out.println("Both arrays are not equal");
		}
		
		input.close();
	}
}