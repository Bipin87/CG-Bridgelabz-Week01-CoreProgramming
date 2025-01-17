import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive method to find the sum of n natural numbers
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + recursiveSum(n - 1);
        }
    }

    // Method to find the sum of n natural numbers using formula
    public static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the an natural number (positive integer): ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter the an positive integer.");
            return;
        }

        int recursiveResult = recursiveSum(n);
        int formulaResult = formulaSum(n);

        System.out.println("Sum of natural numbers (recursive): " + recursiveResult);
        System.out.println("Sum of natural numbers (formula): " + formulaResult);

        if (recursiveResult == formulaResult) {
            System.out.println("Both results are equal.");
        } else {
            System.out.println("Results do not match.");
        }

        input.close();
    }
}