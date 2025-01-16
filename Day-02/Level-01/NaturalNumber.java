import java.util.Scanner;
class NaturalNumber {
	public static void main(String [] args){
		//Create an instance of Scanner class to take user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int number = input.nextInt();
		// Check the number is Natural number 
		if(number > 0){
			//Calculate sum of n natural number 
			int sumOfNaturalNumber= (number * (number + 1))/2;
		    System.out.println(" \nIf the number is a positive integer then the output is"+"The sum of "+ number + " natural numbers is " + sumOfNaturalNumber);
		}
		//Number is not a natural number
		else{
			System.out.println("The number " + number +" is not a natural number");
		}
		input.close();
	}
}
