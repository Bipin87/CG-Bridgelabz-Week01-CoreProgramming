import java.util.Scanner;

class CountTheDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the  user
        System.out.print("Enter the an integer value: ");
        int number = scanner.nextInt();

        // Variable to store the count of digits
        int count = 0;

        // Handle negative numbers by converting to positive
        number = Math.abs(number);

        // Loop to count digits
        while (number != 0) {
            number /= 10;  // Remove the last digits
            count++;       // Increment count variable
        }

        // If number is 0, then the count should be 1 as it has 1 digit
        if (count == 0) {
            count = 1;
        }

        // Display the number of digits
        System.out.println("The number of digits is: " + count);

        scanner.close();
    }
}
