import java.util.Scanner;
public class StringIndexOutOfBoundsException5 {

    // Method to generate the StringIndexOutOfBoundsException
    public static void GenerateException(String text) {
        // Attempting to access an invalid index
        int length = text.length();
		// This will throw StringIndexOutOfBoundsException
        text.charAt(length); 
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void ExceptionHandling(String text) {
        try {
            // This may throw a StringIndexOutOfBoundsException
            int length = text.length();
            text.charAt(length);
			// This may catch the Exception
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught a StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Declaring the scanner class
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String userString = input.nextLine(); 

        try {
			// Call method that generates StringIndexOutOfBoundsException
            GenerateException(userString); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught in main: StringIndexOutOfBoundsException occurred!");
        }
        // Call method that handles StringIndexOutOfBoundsException
        ExceptionHandling(userString); 

        input.close(); 
	}
}