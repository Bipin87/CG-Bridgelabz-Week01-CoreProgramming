import java.util.Scanner;

class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a the  number: ");
        int number = input.nextInt();
		
        // Defining variable by using integer datatype
        int originalNumber = number;
        int sum = 0;
        // Looping through each digitNumber of the number
        while (number != 0) {
            // Getting the last digitNumber of the number using modulus operator
            int digitNumber = number % 10;

            // Calculating the cube of the digitNumber and adding it to sum
            sum += Math.pow(digitNumber, 3);

            // Removing the last digitNumber from the number
            number /= 10;
        }
        // Checking if the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        input.close();
    }
}
