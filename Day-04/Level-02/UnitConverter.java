import java.util.*;
public class UnitConverter {

    // Conversion constants
    private static final double KM_TO_MILES = 0.621371;
    private static final double MILES_TO_KM = 1.60934;
    private static final double METERS_TO_FEET = 3.28084;
    private static final double FEET_TO_METERS = 0.3048;

    // Convert kilometers to miles
    public static double convertKmToMiles(double km) {
        return km * KM_TO_MILES;
    }

    // Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }

    // Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }

    // Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        return feet * FEET_TO_METERS;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Enter The number (in KM): ");
        double km = input.nextDouble();
        double miles = convertKmToMiles(km);
        System.out.println(km + " kilometers is equal to " + miles + " miles.");
		
		System.out.print("Enter The number (in feet): ");
        double feet = input.nextDouble();
        double meters =convertFeetToMeters(feet);
        System.out.println(feet + " feet is equal to " + meters + " meters.");
    }
}