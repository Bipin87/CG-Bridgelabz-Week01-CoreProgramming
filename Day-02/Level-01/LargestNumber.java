// importing the Scanner class in program
import java.util.Scanner;
class LargestNumber{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		// User enter the inputs
		System.out.print("Enter the 1st Number: ");
		int number1 = input.nextInt();
		System.out.print("Enter the 2nd Number: ");
		int number2 = input.nextInt();
		System.out.print("Enter the 3rd Number: ");
		int number3 = input.nextInt();
		
		// By using control flow throw calculate the largest number1
		if(number1 > number2 && number1 > number3){
			System.out.println("Is the first the largest? YES ");
		}
		else{
			System.out.println("Is the first number the largest?  NO ");
		}
		
		if(number2 > number1 && number2 > number3){
			System.out.println("Is the second the largest? YES ");
		}
		else{
			System.out.println("Is the second number the largest?  NO ");
		}
		
		if(number3 > number2 && number3 > number1){
			System.out.println("Is the third the largest? YES ");
		}
		else{
			System.out.println("Is the third number the largest?  NO ");
		}
		input.close();
		
	}
}	
