import java.util.*;
public class UnitConverter2 {

    // Conversion constants
    private static final double YARDS_TO_FEET = 3.0;
    private static final double FEET_TO_YARDS = 0.333333;
    private static final double METERS_TO_INCHES = 39.3701;
    private static final double INCHES_TO_METERS = 0.0254;
    private static final double INCHES_TO_CM = 2.54;

    // Convert yards to feet
    public static double convertYardsToFeet(double yards) {
        return yards * YARDS_TO_FEET;
    }

    // Convert feet to yards
    public static double convertFeetToYards(double feet) {
        return feet * FEET_TO_YARDS;
    }

    // Convert meters to inches
    public static double convertMetersToInches(double meters) {
        return meters * METERS_TO_INCHES;
    }

    // Convert inches to meters
    public static double convertInchesToMeters(double inches) {
        return inches * INCHES_TO_METERS;
    }

    // Convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        return inches * INCHES_TO_CM;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Enter The number (in yards): ");
        double yards = input.nextDouble();
        double feet = convertYardsToFeet(yards);
        System.out.println(yards + " yards is equal to " + feet + " feet.");

		System.out.print("Enter The number (in meters): ");
		double meters = input.nextDouble();
        double inches = convertMetersToInches(meters);
        System.out.println(meters + " meters is equal to " + inches + " inches.");

 		System.out.print("Enter The number (in inches): ");      
        double inches1 = input.nextDouble();
        double cm = convertInchesToCm(inches1);
        System.out.println(inches1 + " inches is equal to " + cm + " centimeters.");
    }
}