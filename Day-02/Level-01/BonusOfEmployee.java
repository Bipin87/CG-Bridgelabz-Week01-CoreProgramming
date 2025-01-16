//importing the Scanner class 
import java.util.Scanner;
class BonusOfEmployee{
	public static void main(String[]args){
            
		//Create an instance of Scanner class to take user inputs
		Scanner scanner = new Scanner(System.in);
			
		//Create a int variable named salary and take input from user
		System.out.print("Enter salary: ");
		int salary = scanner.nextInt();
		
		//Create a int variable named years and take input from user
		System.out.print("Enter years of service: ");
		int years = scanner.nextInt();
		
		int bonus = 0;
		
		
		//checking employees is working for more than 5 years or not
		if(years > 5){
			bonus = (salary * 5)/100;
		}
		System.out.println("Your bonus is " + bonus);
		
	    //Closing the Scanner class
	    scanner.close();
	}
}