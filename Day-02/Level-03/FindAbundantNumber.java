// importing the Scanner class 
import java.util.Scanner;
class FindAbundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a the number: ");
        int number = input.nextInt();

        // Variable to store the sum of divisors
        int sum = 0;

        // Loop to find divisors and sum them up value
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {  // Check if i is a divisor of a number
                sum += i;  // Add divisor in sum
            }
        }

        // Check if sum of divisors is greater than the number itself
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } 
		else {
            System.out.println(number + " is not an Abundant Number.");
        }

        input.close();
    }
}
