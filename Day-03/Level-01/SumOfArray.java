import java.util.Scanner;
class SumOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize variables
        double[] numbers = new double[10]; // Array to store up to 10 numbers
        double totalValue = 0.0; // To store the sum of all numbers
        int indexValue = 0; // indexValue variable for the array

        System.out.println("Enter up to 10 numbers (Enter 0 or a negative number to stop):");

        // Infinite loop for user input
        while (true) {
            System.out.print("Enter the an number: ");
            double num = input.nextDouble();

            // Break if 0 or negative number is entered
            if (num <= 0) {
                break;
            }

            // Break if the array is full
            if (indexValue == 10) {
                System.out.println("Maximum of 10 numbers reached.");
                break;
            }

            // Store the number in the array and increment indexValue
            numbers[indexValue] = num;
            indexValue++;
        }

        // Calculate the sum of the numbers in the array
        for (int i = 0; i < indexValue; i++) {
            totalValue += numbers[i];
        }

        // Display all entered numbers and the totalValue
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < indexValue; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Sum of all numbers: " + totalValue);

        input.close();
    }
}
