// importing the Scanner class in program
import java.util.Scanner;
class FirstSmallestNumber2 {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int number1 = input.nextInt();
		System.out.print("Enter 2nd number: ");
		int number2 = input.nextInt();
        System.out.print("Enter 3rd number: ");
		int number3 = input.nextInt();
		// Using control flow to check smallest number
		if( number1 < number2 && number1 < number3){
			System.out.println("Is the first number the smallest?  YES ");
		}
		else{
			System.out.println("Is the first number the smallest?  NO ");
		}
	}
}
