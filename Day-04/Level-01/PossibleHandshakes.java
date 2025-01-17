
import java.util.Scanner;
class PossibleHandshakes{
	// Initialize the Handshakes method with parameter
	public static int Handshakes(int number){
		// return the result
		return (number * ( number - 1))/2;
	}
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		// Take the number of students by user
		System.out.print("Enter the Number of Students:  ");
		int number = input.nextInt();
		
		// Initialize the class object 
		NumbersOfHandshakes handshakes = new NumbersOfHandshakes();
		
		int totalHandshakes = handshakes.Handshakes( number); // store the result
		
		// Display the result
		System.out.println("Possible Handshakes is: " + totalHandshakes);
		
		input.close();
		
	}
}

