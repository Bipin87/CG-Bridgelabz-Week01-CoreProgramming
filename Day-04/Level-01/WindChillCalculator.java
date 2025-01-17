import java.util.*;

public class WindChillCalculator {

    
     //Calculates the wind chill temperature using the given formula.
     //return The calculated wind chill temperature.
     
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the air temperature in Celsius: ");
        double temperature = input.nextDouble();

        System.out.print("Enter the wind speed in meters per second: ");
        double windSpeed = input.nextDouble();

        double windChill = calculateWindChill(temperature, windSpeed);

        System.out.printf("The wind chill temperature is: %.2f°C\n", windChill);

    }
}