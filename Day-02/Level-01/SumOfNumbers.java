//importing the Scanner class
import java.util.Scanner;
class SumOfNumber{
	public static void main(String[]args){
            
		//Create an instance of Scanner class to take user inputs
		Scanner input = new Scanner(System.in);
			
		System.out.println("Enter the Value: ");
		double userValue = input.nextDouble();	
		
		
		// creating a variable of total double to store the sum
		double totalSum = 0.0;
		
		//using while loop to check if the user entered the value is 0 or not
		while(userValue != 0){
		    totalSum += userValue;
			System.out.println("Enter the new Value again: ");
			userValue = input.nextDouble();
		}
		//Displaying total value
		System.out.println("Your total Sum is "+ totalSum);
	    //Closing the scanner object
	    input.close();
	}
}