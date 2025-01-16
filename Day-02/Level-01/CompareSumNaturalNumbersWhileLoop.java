//importing the Scanner class for taking user input
import java.util.Scanner;
class CompareSumNaturalNumbersWhileLoop{
	public static void main(String[]args){
            
		//Create an instance of Scanner class to take user inputs
		Scanner input = new Scanner(System.in);
			
		System.out.println("Enter the user input number: ");
		int number = input.nextInt();
		
		int formulaeResult = 0;
        if (number > 0){
		    formulaeResult = number * (number + 1)/2;
		}		
		
		int loopResult = 0;
		//using while loop to calculate the sum
		while(number > 0){
		    loopResult += number;
			number--;
		}
		//printing result 
		System.out.println("Result obtained using formulae is "+ formulaeResult + " and using while loop is "+ loopResult);
		
	    input.close();
	}
}