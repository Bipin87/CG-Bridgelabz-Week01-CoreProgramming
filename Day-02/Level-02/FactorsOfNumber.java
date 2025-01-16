import java.util.Scanner;

class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        // Initialize the user input in variable number
        System.out.print("Enter a number to find its factors: ");
        int number = input.nextInt();

        // Loop to find the factors and printing them
        for (int i = 1; i <= number; i++) {
            // Check if the number is perfectly divisible by i
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        input.close();
	}
}