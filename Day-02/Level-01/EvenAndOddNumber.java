//importing the Scanner class for taking user inputs
import java.util.Scanner;
class EvenAndOddNumber{
	public static void main(String[]args){
            
		Scanner value = new Scanner(System.in);
			
		//Create a int variable named number and take input from user
		System.out.println("Enter number: ");
		int number = value.nextInt();
		
		
		//using the for loop for the iteration
		for(int i = 1 ; i < number; i++){
			
			//checking if the number is even
			if( i % 2 == 0){
				System.out.println(i + " is even number");
			}
			
			//if number is not even it must be odd number
			else{
				System.out.println(i + " is odd number");
			}
		}
		
	    value.close();
	}
}