import java.util.Scanner;

class PowerOfNumber {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        
        // Initialize the user input in variable number
        System.out.print("Enter the base number: ");
        int number = variable.nextInt();
        
        // Initialize the user input in variable power
        System.out.print("Enter the power: ");
        int power = variable.nextInt();
        
        // Initialize the result variable to 1
        int result = 1;
        
        // Loop from 1 to power
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Print the result
        System.out.println("Power "+ power + " of "+ number + " is " +result);
        
        variable.close();
	}		
}