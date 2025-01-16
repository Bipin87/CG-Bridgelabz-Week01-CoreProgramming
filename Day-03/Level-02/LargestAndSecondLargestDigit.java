import java.util.Scanner;
class LargestAndSecondLargestDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize the maximum number of digits to store
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // While loop to extract digits and store them in the array
        while (number != 0) {
            // Remove the last digit from the number
            digits[index] = number % 10;
            number = number / 10;

            // Increment the index
            index++;

            // If the array is full, increase the array size by 10
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];

                // Copy the digits from the original array to the new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // Assign the expanded array to digits
                digits = temp;
            }
        }

        // Initialize the largest and second largest digits
        int largest = -1;
        int secondLargest = -1;

        // Find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the result
        if (secondLargest == -1) {
            System.out.println("There is no second largest digit.");
        } else {
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        }

        input.close();
    }
}
