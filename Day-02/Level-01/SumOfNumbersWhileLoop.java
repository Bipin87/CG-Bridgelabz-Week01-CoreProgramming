//importing the Scanner class
import java.util.Scanner;
class SumOfNumbersWhileLoop{
	public static void main(String[]args){
            
		//Create an instance of Scanner class to take user inputs
		Scanner input = new Scanner(System.in);
			
		//Create a Double variable named value and take input from user
		System.out.println("Enter The Value: ");
		double value = input.nextDouble();	
		
		
		// creating a variable of type double to store the sum
		double total = 0.0;
		
		//using while loop to check if the user entered value is 0 or not
		while(true){
		
		    // if value is zero or in negative break loop
		    if(value <= 0){
		        break;
		    }
		    total += value;
			System.out.println("Enter the new Value again: ");
			value = input.nextDouble();
		}
		//Display the  total value in result
		System.out.println("Your total Sum is "+ total);
	    //Closing the scanner class object
	    input.close();
	}
}