//including scanner class to take variables
import java.util.Scanner;
class FindLeapYearSingleLine{
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int year = variable.nextInt();
		//checking for the leap year or not
		if(year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))){
		    System.out.println("Leap Year");
		}
		else{
		    System.out.println("Not Leap Year");
		}
		//Closing scanner
		variable.close();
		
	}
}