import java.util.Scanner;
public class CountWordsAndDisplay3{
	
	//method to count the length of string
	public static int countLengthOfString(String str ){
		
		//initialize a variable count to store the length of string
		int count = 0;
		for(char ch : str.toCharArray()){
			count++;
		}
		return count;
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
	public static void splitAndStore(String str, String resultantArray[][], int size){

		//initialize a string to store resultant string
		String resultantString = "";
		
		//initialize a variable rowIndex to keep track of row index
		int rowIndex = 0;
		
		//initialize a variable count to count the length of each word
		int count = 0;
		
		//use for loop to iterate over the string
		for(int i = 0;  i < size; i++){
			
			//check if there encounters a space store the word in 2D array with its length
			if(str.charAt(i) == ' '){
				resultantArray[rowIndex][0] = resultantString;
				resultantString = "";
				resultantArray[rowIndex++][1] = String.valueOf(count);
				count = 0;
			}
			
			//else keep adding the character to the word
			else{
				resultantString += str.charAt(i);
				count++;
			}
		}
		
		//adding last word with it's length
		resultantArray[rowIndex][0] = resultantString;
		resultantArray[rowIndex++][1] = String.valueOf(count);
	}
	
	//create a method to print the 2D array
	public static void displayMatrix(String resultantArray[][]){
		for(int i = 0; i < resultantArray.length; i++){
			System.out.println(resultantArray[i][0] + " - " + resultantArray[i][1]);
		}
	}
	
	//main method
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
		String resultantArray[][] = new String[wordsLength][2];
		
		//invoke splitAndStore method and pass parameters as str and resultantArray
		splitAndStore(str, resultantArray, size);
		
		//invoke displayMatrix method to print the output
		displayMatrix(resultantArray);
		
		//close scanner
		input.close();
	}
}