import java.util.Scanner;

public class AnalysisOfNumber {

    // Method to check if a number is positive
    public static boolean isPositive(int number) {
        return number > 0;
    }

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compareNumbers(int num1, int num2) {
        if (num1 > num2) {
            return 1; // num1 is greater than num2
        } else if (num1 < num2) {
            return -1; // num1 is less than num2
        } else {
            return 0; // num1 is equal to num2
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Get input from the user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Analyze each number
        for (int i = 0; i < 5; i++) {
            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println(numbers[i] + " is positive and even.");
                } else {
                    System.out.println(numbers[i] + " is positive and odd.");
                }
            } else {
                System.out.println(numbers[i] + " is negative.");
            }
        }

        // Compare first and last elements
        int comparisonResult = compareNumbers(numbers[0], numbers[4]);
        if (comparisonResult == 1) {
            System.out.println("First element is greater than the last element.");
        } else if (comparisonResult == -1) {
            System.out.println("First element is less than the last element.");
        } else {
            System.out.println("First element is equal to the last element.");
        }

        scanner.close();
    }
}