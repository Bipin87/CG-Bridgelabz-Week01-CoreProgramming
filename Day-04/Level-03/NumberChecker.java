// importing the Array Package
import java.util.Arrays;
// importing the Scanner class Package
import java.util.Scanner;
public class NumberChecker {
    // Method to find the countOfDigits number
    public static int countOfDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    // Method to find the storeTheDigits number
    public static int[] storeTheDigits(int number) {
        int digits[] = new int[countOfDigits(number)];
        int index = digits.length - 1;
        while (number != 0) {
            digits[index--] = number % 10;
            number /= 10;
        }
        return digits;
    }
    // Method to find the duckNumber number

    public static boolean duckNumber(int number) {
        int[] digits = storeTheDigits(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }
    // Method to find the armstrongNumber number

    public static boolean armstrongNumber(int number) {
        int[] digits = storeTheDigits(number);
        int sum = 0;
        int numDigits = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, numDigits);
        }
        return sum == number;
    }
	
    // Method to find the  largest number
    public static int findLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int digit : arr) {
            if (digit > largest) {
                largest = digit;
            }
        }
        return largest;
    }
	
    // Method to find the second largest number
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : arr) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return secondLargest;
    }
    // Method to find the smallest number
    public static int findSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        for (int digit : arr) {
            if (digit < smallest) {
                smallest = digit;
            }
        }
        return smallest;
    }
    // Method to find the second smallest number
    public static int findSecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : arr) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number: ");
        int number = input.nextInt();
        // Printing the Results
        System.out.println("Number is: " + number);
        System.out.println("Number of Digits: " + countOfDigits(number));

        int[] digits = storeTheDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        System.out.println("Is Duck Number? " + duckNumber(number));
        System.out.println("Is Armstrong Number? " + armstrongNumber(number));

        System.out.println("Largest Digit: " + findLargest(digits));
        System.out.println("Second Largest Digit: " + findSecondLargest(digits));
        System.out.println("Smallest Digit: " + findSmallest(digits));
        System.out.println("Second Smallest Digit: " + findSecondSmallest(digits));
		input.close();
    }
}