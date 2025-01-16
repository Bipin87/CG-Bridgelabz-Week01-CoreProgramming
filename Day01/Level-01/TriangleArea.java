import java.util.Scanner;
class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: base and height
        System.out.print("Enter the base of the triangle in inches: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle in inches: ");
        double height = scanner.nextDouble();
        // Calculate area in square inches
        double areaInSquareInches = 0.5 * base * height;
        // Convert area to square centimeters
        double areaInSquareCm = areaInSquareInches * 6.4516; // 1 square inch = 6.4516 square cm
        // Convert height to other units
        double heightInCm = height * 2.54; // 1 inch = 2.54 cm
        int heightInFeet = (int) height / 12; // 1 foot = 12 inches
        double remainingInches = height % 12;
        // Output results
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + heightInFeet + " and inches is " + remainingInches);
        // Close the Scanner input
        scanner.close();
    }
}
