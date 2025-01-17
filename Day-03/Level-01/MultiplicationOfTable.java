import java.util.Scanner;

class MultiplicationOfTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get an integer input for the number
        System.out.print("Enter the an number: ");
        int number = input.nextInt();

        // Define an integer array to store the results of multiplication
        int[] table = new int[10];

        // Calculate the multiplication of table array
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1); // Store the result of number * (i+1)
        }

        // Display the multiplication table
        System.out.println("Multiplication of Table is " + number + ":");
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        input.close();
    }
}