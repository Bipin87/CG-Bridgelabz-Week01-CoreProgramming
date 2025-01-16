// importing the Scanner class 
import java.util.Scanner;

class FindGreatestFactor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);       

        //Taking the  input from user

        System.out.print("Enter the number: ");

        int number = scanner.nextInt();
      
        // Initialize the greatestFactor variable to 1
        int greatestFactor = 1;
     
        // Loop from number - 1 down to 1
        for (int j = number - 1; j >= 1; j--) {
            // Check  number is perfectly divisible by j
            if (number % j == 0) {
                greatestFactor = j;
                break;
            }

        }      
        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
       
        scanner.close();
	}

}