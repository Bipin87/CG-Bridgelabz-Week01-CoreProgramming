import java.util.Scanner;
import java.lang.Integer;
class NumberFormatException7 {

    // Method to generate the exception
    public static void GenerateException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException in GenerateException: " + e.getMessage());
        }
    }

    // Method to handle the exception
    public static void ExceptionHandling(String text) {
        try {
            // This may give the exception
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize the user string value in the text variable
        System.out.print("Enter the an string: ");
        String text = input.nextLine();

        // Call the method to generate the exception
        GenerateException(text);

        // Call the method to handle the exception
        ExceptionHandling(text);

        // Close Scanner class
        input.close();
    }
}
