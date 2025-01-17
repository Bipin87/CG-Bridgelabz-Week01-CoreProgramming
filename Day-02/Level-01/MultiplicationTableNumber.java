//importing scanner class
import java.util.Scanner;
public class MultiplicationTableNumber{
	public static void main(String[] args){
		//creating scanner class instance 
		Scanner scanner = new Scanner(System.in);
	
		// Create a int variable name number and take scanner from user
		System.out.print("Enter number: ");
		int number = scanner.nextInt();
		
		// Using for loop to print the multiplication table
		for(int i = 6; i <= 9; i++){
			System.out.println(number + " * " + i +" = "+ (number * i));
		}

		//closing Scanner class instance
		scanner.close();
	}
	
}