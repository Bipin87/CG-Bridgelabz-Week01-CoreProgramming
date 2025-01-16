import java.util.*;

public class TrigonometryCalculator {

    
    //Calculates sine, cosine, and tangent of an angle in degrees.
     
     //return An array containing sine, cosine, and tangent values in that order.
    
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert degrees to radians
        double angleInRadians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sin = Math.sin(angleInRadians);
        double cos = Math.cos(angleInRadians);
        double tan = Math.tan(angleInRadians);

        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = input.nextDouble();

        double[] results = calculateTrigonometricFunctions(angle);

        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);

    }
}