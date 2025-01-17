import java.util.Scanner;

public class ArrayIndexOutOfBoundsException8 {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void GenerateException(String[] names) {
        System.out.println("Attempting to access an index outside the array bounds...");
		
        // This will throw an ArrayIndexOutOfBoundsException
        System.out.println(names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void HandleException(String[] names) {
        try {
            System.out.println("Attempting to access an index outside the array bounds...");
            // This will throw an ArrayIndexOutOfBoundsException
            System.out.println(names[names.length]);
        } 
		catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        } 
		catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for the array of names
        System.out.print("Enter the number of names you want to input: ");
        int number = input.nextInt();
        input.nextLine();

        String[] names = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter the name " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }

        // Call method to generate the exception
        try {
            GenerateException(names);
        } 
		catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Call method to handle the exception
        HandleException(names);

        input.close();
    }
}
