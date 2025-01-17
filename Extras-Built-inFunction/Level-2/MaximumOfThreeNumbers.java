import java.util.Scanner;

public class MaximumOfThreeNumbers {

    // Method to get a number from the user
    public static int getNumberFromUser(String message, Scanner input) {
        System.out.print(message);
        return input.nextInt();  // Read an integer from the user
    }

    // Method to find the maximum of three numbers
    public static int findMaximum(int num1, int num2, int num3) {
        // Compare the numbers to find the maximum
        if (num1 >= num2 && num1 >= num3) {
            return num1;  // num1 is the largest
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;  // num2 is the largest
        } else {
            return num3;  // num3 is the largest
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get three numbers from the user
        int number1 = getNumberFromUser("Enter the first number: ", input);
        int number2 = getNumberFromUser("Enter the second number: ", input);
        int number3 = getNumberFromUser("Enter the third number: ", input);

        // Calculate the maximum of the three numbers
        int max = findMaximum(number1, number2, number3);

        // Display the result
        System.out.println("The maximum of the three numbers is: " + max);
        
        input.close();  
    }
}
