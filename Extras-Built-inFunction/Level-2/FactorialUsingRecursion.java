import java.util.Scanner;
public class FactorialUsingRecursion {
    // Recursive function to calculate factorial
    public static int calculateFactorial(int n){
        if (n == 0){
            return 1;
        }
        else {
            return (n * calculateFactorial(n-1));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the number from the user
        System.out.print("Enter the an number: ");
        int number = scanner.nextInt();
        // Calculate the factorial using recursion
        int result = calculateFactorial(number);

        // Display the result
        System.out.println("Factorial of " + number + " is " + result);

        scanner.close();

    }
}

