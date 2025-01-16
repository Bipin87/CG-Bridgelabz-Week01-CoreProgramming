import java.util.Scanner;

class OddAndEvenArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the number is a natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number (greater than 0).");
            return;
        }

        // Define arrays for odd and even numbers
        int[] evenNumber = new int[number / 2 + 1];
        int[] oddNumber = new int[number / 2 + 1];

        // Index variables for odd and even arrays
        int evenIndex = 0, oddIndex = 0;

        // Iterate from 1 to the given number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumber[evenIndex++] = i; // Add even numbers
            } else {
                oddNumber[oddIndex++] = i; // Add odd numbers
            }
        }

        // Print the odd numbers array
        System.out.print("Odd Numbers: ");
        for (int j = 0; j < oddIndex; j++) {
            System.out.print(oddNumber[j] + " ");
        }
        System.out.println();

        // Print the even numbers array
        System.out.print("Even Numbers: ");
        for (int k = 0; k < evenIndex; k++) {
            System.out.print(evenNumber[k] + " ");
        }
        System.out.println();

        input.close();
    }
}
