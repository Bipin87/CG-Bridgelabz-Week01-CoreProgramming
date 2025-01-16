import java.util.Scanner;
class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the an number: ");
        long number = input.nextLong();

        // Array to store digits of the number
        int[] digitsArray = new int[10];  // Array to store individual digits
        int[] frequencyArray = new int[10];  // Array to store frequency of each digits

        // Extract digits and store them in digitsArray
        long temp = number;
        while (temp > 0) {
            int digit = (int) (temp % 10);  // Get the last digit
            digitsArray[digit]++;  // Increment the frequency for the current digit
            temp = temp / 10;  // Remove the last digit
        }

        // Display the frequency of each digit
        System.out.println("\nFrequency of each digit in the number:");
        for (int i = 0; i < 10; i++) {
            if (digitsArray[i] > 0) {  // Print the digit frequency if it is non-zero
                System.out.println("Digit " + i + ": " + digitsArray[i] + " time(s)");
            }
        }

        input.close();
    }
}
