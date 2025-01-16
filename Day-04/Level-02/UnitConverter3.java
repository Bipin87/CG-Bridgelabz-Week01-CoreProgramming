import java.util.*;
public class UnitConverter3 {

    // Conversion constants
    //public static final double FARENHEIT_TO_CELSIUS = (temp - 32) * 5 / 9;
    //public static final double CELSIUS_TO_FARENHEIT = (celsius * 9 / 5) + 32;
    public static final double POUNDS_TO_KILOGRAMS = 0.453592;
    public static final double KILOGRAMS_TO_POUNDS = 2.20462;
    public static final double GALLONS_TO_LITERS = 3.78541;
    public static final double LITERS_TO_GALLONS = 0.264172;

    // Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * POUNDS_TO_KILOGRAMS;
    }

    // Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * KILOGRAMS_TO_POUNDS;
    }

    // Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * GALLONS_TO_LITERS;
    }

    // Convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * LITERS_TO_GALLONS;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Enter The number (in Fahrenheit): ");
        double fahrenheit = input.nextDouble();
        double celsius =convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");

		System.out.print("Enter The number (in kilograms): ");
        double kilograms = input.nextDouble();
        double pounds = convertKilogramsToPounds(kilograms);
        System.out.println(kilograms + " kilograms is equal to " + pounds + " pounds.");

		System.out.print("Enter The number (in gallons): ");
        double gallons = input.nextDouble();
        double liters =convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + liters + " liters.");
    }
}