import java.util.Scanner;

class FactorsInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking the  user input for variable  number
        System.out.print("Enter an number to find its factors: ");
        int number = input.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Error: Please enter the an positive number: ");
            return;
        }

        // Initialize variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int indexValue = 0;

        // Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // If the array is full, resize the array
                if (indexValue == maxFactor) {
                    maxFactor *= 2; // Double the array size
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length); // Copy elements
                    factors = temp; // Reassign the array
                }
                // Add the factor to the array
                factors[indexValue++] = i;
            }
        }

        // Display the factors of the number
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < indexValue; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        input.close();
    }
}
