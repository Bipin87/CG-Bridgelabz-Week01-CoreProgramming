import java.util.Scanner;
class NumbersOfHandshakes{
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
		int totalHandshakes =Handshakes( number); // store the result
		
		// Display the result
		System.out.println("Maximum number of students  Handshakes is: " + totalHandshakes);
		
		input.close();
		
	}
}