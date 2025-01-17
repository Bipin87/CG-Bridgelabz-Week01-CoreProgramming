//importing the Scanner class for taking user inputs
import java.util.Scanner;
class SpringSeason{
	public static void main(String[]args){

                Scanner input = new Scanner(System.in);
			
		//Create a int variable named month and take input from user
		System.out.println("Enter month: ");
		int month = input.nextInt();	
		
		
		//Create a int variable named Day and take input from user
		System.out.println("Enter Day: ");
		int day = input.nextInt();
		
		//checking Spring Season is from March 20 to June 20

		if( (month == 3 && day >= 20) || (month == 6 && day <= 20) ){
		    System.out.println("Spring Season");
		}
		
		//checking if the month is april or may 
		else if(month > 3 && month < 6){
		    System.out.println("Spring Season");
		}
		
		//if month is not a spring season
		else{
		    System.out.println("Not Spring Season");
		}
	    input.close();
	}
}