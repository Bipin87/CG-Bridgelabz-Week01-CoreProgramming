/* GCD and LCM Calculator:
○ Create a program that calculates the Greatest Common Divisor (GCD) and Least
Common Multiple (LCM) of two numbers using functions.
○ Use separate functions for GCD and LCM calculations, showcasing how modular
code works. */
import java.util.Scanner;
import java.lang.Math;
public class GCDAndLCMCalculator {
    // Function to calculate GCD 
    public static int calculateGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return calculateGCD(num2, num1 % num2);
    }
    // Function to calculate LCM
    public static int calculateLCM(int num1, int num2) {
        return (num1 * num2) / calculateGCD(num1, num2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for two numbers
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        // Calculate GCD and LCM
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);
        // Display results
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
    
}
    