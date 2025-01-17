import java.util.Scanner;
class NumberOfRounds{
	// Initialize the Handshakes method with parameter with return type int 
	public static int Rounds(int side1, int side2, int side3){
		int perimeter = side1 + side2 + side3;
		int distance = 5 * 1000;
		
		// return the result
		return distance/perimeter;
	}
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		// Take the user input of Triangle sides
		System.out.print("Enter the Triangle side1 (in meters):  ");
		int side1 = input.nextInt();
		System.out.print("Enter the Triangle side2 (in meters):  ");
		int side2 = input.nextInt();
		System.out.print("Enter the Triangle side3 (in meters):  ");
		int side3 = input.nextInt();
		
		// Initialize the class object 
		NumberOfRounds round = new NumberOfRounds();
		
		int totalRounds = round.Rounds( side1, side2, side3); // store the result
		
		// Display the result
		System.out.println("User complete the number of rounds in 5km: " + totalRounds);
		
		input.close();
		
	}
}