import java.util.Scanner;
public class PrimeNumber{
    // Function to check if a number is prime
    public static boolean isPrimeNumber(int number){
        if (number <= 1) {
            return false;
        }
        // Check from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get user input
        System.out.println("Enter the an number: ");
        int number = scanner.nextInt();
        boolean isPrime = isPrimeNumber(number);
        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        }
        else {
            System.out.println(number + " is not a prime number.");
        }
    }
}