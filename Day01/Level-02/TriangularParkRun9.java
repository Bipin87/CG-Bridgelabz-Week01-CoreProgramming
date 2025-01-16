import java.util.Scanner;
class TriangularParkRun9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: sides of the triangular park
        System.out.print("Enter the length of the first side of the triangular park (in meters): ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the length of the second side of the triangular park (in meters): ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the length of the third side of the triangular park (in meters): ");
        double side3 = scanner.nextDouble();
        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3;
        // Convert the total distance to meters (5 km = 5000 meters)
        double totalDistance = 5000;
        // Calculate the number of rounds
        double rounds = totalDistance / perimeter;
        // Output the result
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");
        scanner.close();
    }
}
