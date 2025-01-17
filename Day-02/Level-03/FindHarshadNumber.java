import java.util.Scanner;

class FindHarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the an number: ");
        int number = input.nextInt();

        // Variable to store sum of digits
        int sum = 0;
        int originalNumber = number;

        // Loop throw calculate the sum of digits
        while (number != 0) {
            sum += number % 10;  // Add the last digits to sum
            number /= 10;         // Remove the last digits
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        input.close();
    }
}
