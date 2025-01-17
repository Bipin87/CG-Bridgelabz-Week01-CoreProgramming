import java.util.Arrays;
import java.util.Scanner;
public class NumberChecker2 {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Method to Store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int digits[] = new int[countDigits(number)];
        int index = digits.length - 1;
        while (number != 0) {
            digits[index--] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to Check if a number is a harshad number
    public static boolean isHarshadNumber(int number) {
        int[] digits = storeDigits(number);
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequencies(int number) {
        int[] digits = storeDigits(number);
        int[][] frequencies = new int[10][2]; // 10 possible digits (0-9)

        // Initialize the first column with digits (0-9)
        for (int i = 0; i < 10; i++) {
            frequencies[i][0] = i;
        }

        // Count the frequency of each digit
        for (int digit : digits) {
            frequencies[digit][1]++; 
        }

        return frequencies;
    }

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.println("Number: " + number);
        System.out.println("Number of Digits: " + countDigits(number));

        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + sumOfSquares(digits));

        System.out.println("Is Harshad Number? " + isHarshadNumber(number));

        int[][] frequencies = findDigitFrequencies(number);
        System.out.println("Digit Frequencies:");
        for (int[] row : frequencies) {
            System.out.println(Arrays.toString(row));
        }
		input.close();
    }
}