//importing the Scanner class 
import java.util.Scanner;
class CheckWhether{
	public static void main(String[]args){
            
		//Create an instance of Scanner class to take user inputs
		Scanner input = new Scanner(System.in);
			
		//Create a int variable named number and take input from user
		System.out.println("Enter number: ");
		int number = input.nextInt();	
		
		
		//checking if the number is greater than zero than it is positive
		if( number > 0){
		    System.out.println("Positive");
		}
		
		//checking if the number is lesser than zero than it is negative
		else if(number < 0){
		    System.out.println("Negative");
		}
		
		//if the number is not positive nor negative than it should be zero
		else{
		    System.out.println("Zero");
		}

	    input.close();
	}
}