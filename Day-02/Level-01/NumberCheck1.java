// importing the Scanner class
import java.util.Scanner;
class NumberCheck1 {
    public static void main(String [] args){
	    Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int number = input.nextInt();
		// Check the number is divisible or not
		if(number % 5 == 0){
		    System.out.println(" Is the number " + number + " divisible by 5? Yes");
			}
		else{
		    System.out.println(" Is the number " + number + " divisible by 5? No");
			}
		// close the Scanner 
		input.close();
		}
	}
		