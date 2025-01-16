import java.util.Scanner;
class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: distance in feet
        System.out.print("Enter the distance (in feet): ");
        double distanceInFeet = scanner.nextDouble();
        // Convert to yards and miles
        double distanceInYards = distanceInFeet / 3; // 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760; // 1 mile = 1760 yards
        // Convert height to centimeters, feet, and inches
        double heightInCm = distanceInFeet * 30.48; // 1 foot = 30.48 cm
        int heightInFeet = (int) distanceInFeet; // Full feet
        double heightInInches = (distanceInFeet - heightInFeet) * 12; // Remaining inches
        // Output the results
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + heightInFeet + " and inches is " + heightInInches);
        scanner.close();
    }
}
