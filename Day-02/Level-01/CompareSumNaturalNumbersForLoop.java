//importing the Scanner class for taking user inputs
import java.util.Scanner;
class CompareSumNaturalNumbersForLoop{
	public static void main(String[]args){
            
		//Create an instance of Scanner class to take user inputs
		Scanner input = new Scanner(System.in);
			
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		
		int formulaResult = 0;
        if (number > 0){
		    formulaResult = number * (number + 1)/2;
		}		
		
		int result = 0;
		//using for loop to decrement the number and find result
		for(int i = number; i > 0 ; i--){
		    result += i;
		}
		//printing result 
		System.out.println("Result obtained using formulae is " + formulaResult + " and using for loop is "+ result);
		
	    //Closing the scanner object
	    input.close();
	}
}