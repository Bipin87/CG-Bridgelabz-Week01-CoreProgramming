import java.util.Scanner;

public class FibonacciSequence {

    // Function to generate and print the Fibonacci sequence
    public static void fibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        // Special cases for n = 1 or n = 2

        if (n == 1) {
            System.out.println("Fibonacci Sequence: 0");
            return;
        }

        if (n == 2) {
            System.out.println("Fibonacci Sequence: 0, 1");
            return;
        }

        // Array to store the Fibonacci sequence
        int[] fibonacciSeries = new int[n];
        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;

        // Generate the Fibonacci sequence
        for (int i = 2; i < n; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }

        // Print the Fibonacci sequence
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSeries[i]);
            if (i < n - 1) {
                System.out.print(", "); // Print commas between numbers
            }
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of terms from the user
        System.out.print("Enter the number of terms: ");
        int term = input.nextInt();

        // Call the function
        fibonacci(term);

        input.close(); 
    }
}
