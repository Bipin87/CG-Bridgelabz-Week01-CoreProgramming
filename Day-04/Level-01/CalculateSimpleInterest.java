
import java.util.Scanner;
class CalculateSimpleInterest{
	//  Initialize the new method to calculate simple interest
	public static double SimpleInterest(double principal, double rate, double time){
		double result = ( principal * rate * time) / 100;
		// Return the result
		return result;
	}
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		// Create a variables for a user inputs
		System.out.print("Enter the Principal Amount:  ");
		double principal = input.nextDouble();
		System.out.print("Enter the Rate of Interest (in %):  ");
		double rate = input.nextDouble();
		System.out.print("Enter the Time Duration (in year):  ");
		double time = input.nextDouble();
		// Initialize the object of class
		CalculateSimpleInterest value = new CalculateSimpleInterest();
		double simpleInterest = value.SimpleInterest(principal, rate, time);
		// Display the result
		System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + "%  and Time " + time);
		input.close();
	}
}
