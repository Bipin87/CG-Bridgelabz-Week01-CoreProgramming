//importing the Scanner class 
import java.util.Scanner;
class CheckIfVote{
	public static void main(String[]args){
            
		//Create an instance of Scanner class to take user input
		Scanner input = new Scanner(System.in);
			
		//Create a int variable named age and take input from to user
		System.out.println("Enter Age: ");
		int age = input.nextInt();	
		
		
		//checking if the age is valid or not
		if(age < 0){
		    System.out.println("Invalid age");
		}
		
		
		//checking if the user is eligible to vote or not
		else if( age >= 18){
		    System.out.println("The person's age is " + age +" and can vote.");
		}
		
		//In condition user is not eligible to vote
		else{
		    System.out.println("The person's age is "+ age +" and cannot vote.");
		}
		
	    //Closing the scanner object
	    input.close();
	}
}