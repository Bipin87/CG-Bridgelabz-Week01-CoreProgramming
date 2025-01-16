import java.util.Scanner;
public class IllegalArgumentException6{

    // Method that generates the an IllegalArgumentException
    public static void GenerateException(String input) {
        try {
            // Trying to create a substring with start index greater than end index
            String subSubstring = input.substring(5, 2);
            System.out.println("Substring: " + subSubstring);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    // Method that handles the exception using a try-catch block
    public static void RuntimeExceptionHandling(String input) {
        try {
            // Attempt to create a substring with incorrect index
            String subSubstring = input.substring(5, 2);
            System.out.println("Substring: " + subSubstring);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the an string: ");
        String input = scanner.nextLine();

        // Call the method to generate the exception
        GenerateException(input);

        // Call the method to handle the RuntimeException
        RuntimeExceptionHandling(input);
		
		scanner.close();
    }
}
