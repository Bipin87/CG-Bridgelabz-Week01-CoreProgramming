import java.util.Scanner;
class CheckNumbers{
	// Initialize the CheckIntegers method with parameter with return type int
	public static int CheckIntegers(int number){
		if (number < 0){
			return -1;
		}
		else if(number > 0){
			return 1;
		}
		else{
			return 0;
		}
}
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		// Take the Integer number by user
		System.out.print("Enter the Integer Number:  ");
		int number = input.nextInt();
		
		int result=CheckIntegers( number); // store the result
		
		// Display the result
		System.out.println(result);
		
		input.close();
		
	}
}