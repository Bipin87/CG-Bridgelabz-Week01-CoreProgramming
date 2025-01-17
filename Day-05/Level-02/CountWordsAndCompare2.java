import java.util.Scanner;
public class CountWordsAndCompare2{
	
	//method to count the length of string
	public static int countLengthOfString(String str ){
		
		//initialize a variable count to store the length of string
		int count = 0;
		for(char ch : str.toCharArray()){
			count++;
		}
		return count;
	}
	
	//method to compare arrays
	public static boolean compareArray(String arrayFromBuiltIn[], String arrayFromMethod[]){
		for(int i = 0; i < arrayFromBuiltIn.length; i++){
			if (!arrayFromBuiltIn[i].equals(arrayFromMethod[i])) {
                return false;
            }
		}
		return true;
	}
	
	//method to calculate the number of words in a string
	public static int countWords(String str, int size){
		int count = 1; 
		for(int i = 0 ;  i < size; i++){
			if(str.charAt(i)  == ' '){
				count++;
			}
		}	
		//return the number of counts
		return count;
	}
	
	//method to split the string and store the words in 2D array
	public static void splitAndStore(String str, String resultantArray[], int size){

		//initialize a string to store resultant string
		String resultantString = "";
		
		//initialize a variable arrayIndex to keep track of resultantArray index
		int arrayIndex = 0;
		//use for loop to iterate over the string
		for( int i = 0;  i < str.length() ; i++){
			
			//check if there encounters a space store the word in array 
			if(str.charAt(i) == ' '){
				resultantArray[arrayIndex++]= resultantString;
				resultantString = "";
			}
			
			//else keep adding the character to the word
			else{
				resultantString += str.charAt(i);
			}
		}
		resultantArray[arrayIndex]= resultantString;
	}
	
	//create a method to print array
	public static void printArray(String arr[]){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
	
		//create an instance of scanner class
		Scanner input = new Scanner(System.in);
		
		//get first string input from user
		System.out.println("Enter string: ");
		String str = input.nextLine().trim();
		
		int size = countLengthOfString(str);
		// invoke countWords method to count the number of words
		int wordsLength = countWords(str, size);
		
		//initialize a 2D array to store the word with it's length
		String resultantArray[]= new String[wordsLength];
		
		//invoke splitAndStore method and pass parameters as str and resultantArray
		splitAndStore(str, resultantArray, size);
		
		//storing result from inbuilt method
		String arrayFromBuiltIn[] = str.split(" ");
		
		//initialize a boolean variable to store the result from compare arrays method
		boolean isEqual = compareArray(resultantArray, arrayFromBuiltIn);
		
		//print array from user defined method
		System.out.print("Your Array from user define method is: ");
		printArray(resultantArray);
		
		//print array from built-in method
		System.out.print("Your Array from built-in method is: ");
		printArray(arrayFromBuiltIn);
		
		//checking if comapre array returns true value then if case will run otherwise the else case will run 
		if(isEqual){
			System.out.println("Both arrays are Equal");
		}
		else {
			System.out.println("Both array are Not Equal");
		}
		
		//close scanner
		input.close();
	}
}