import java.util.Scanner;
class SquareSideCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();
        // Calculate the side length
        double side = perimeter / 4;
        // Output the results
        System.out.println("The length of the side is " + side +" whose perimeter is " + perimeter);
        scanner.close();
    }
}
