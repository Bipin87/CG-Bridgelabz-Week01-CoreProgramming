import java.util.Scanner;
class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        // taking input from the user
        System.out.print("Enter  the a number: ");
        int number = input.nextInt();
        
        // Initialize the primeNumber variable as true
        boolean primeNumber = true;
        
        // Check the condition true or not
        if (number <= 1) {
            primeNumber = false;
        } else {
            for (int i = 2; i < number ; i++) {
                if (number % i == 0) {
                    primeNumber = false;
                    break;
                }
            }
        }
        // Display the result
        if (primeNumber) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        input.close();
	}
}