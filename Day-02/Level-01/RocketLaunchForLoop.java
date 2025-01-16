//importing the Scanner class
import java.util.Scanner;
class RocketLaunchForLoop{
	public static void main(String[]args){
            
		//Create an instance of Scanner class to take user input
		Scanner input = new Scanner(System.in);
			
		System.out.println("Enter Counter: ");
		int counter = input.nextInt();	
		
		//using while loop Control Flow
		for(int j = counter; j >0; j--){
		    
			System.out.println(j);
		}
	    input.close();
	}
}