import java.util.Scanner;

class FizzBuzzForLoop {
    public static void main(String[] args) {

        // Declaring Scanner class instance
        Scanner variable = new Scanner(System.in);

        System.out.print("Enter the  an  positive integer: ");
        int number = variable.nextInt();

        // Checking if the variables is a positive integer
        if (number > 0) {
            // Iterate for loop forward
            for (int i = 0; i <= number; i++) {
                // Checking for  remainder of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i+" FizzBuzz");
                }
                // Checking for remainder of 3
                else if (i % 3 == 0) {
                    System.out.println(i+" Fizz");
                }
                // Checking for remainder of 5
                else if (i % 5 == 0) {
                    System.out.println(i+" Buzz");
                }
            }
        } 
		else {
            System.out.println("Please enter  the an positive integer.");
        }

        // Closing the scanner
        variable.close();
	}
}