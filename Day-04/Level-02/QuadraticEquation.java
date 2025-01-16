import java.util.Scanner;

public class QuadraticEquation {

    /**
     * Finds the roots of a quadratic equation (ax^2 + bx + c = 0).
     *
     * a Coefficient of x^2
     * b Coefficient of x
     * c Constant term
     * An array containing the roots of the equation. 
     * If there are no real roots, an empty array is returned.
     */
    public static double[] findRoots(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c; // Calculate discriminant

        if (discriminant > 0) { // Two distinct real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new double[]{root1, root2};
        } else if (discriminant == 0) { // One real root (repeated)
            double root = -b / (2 * a);
            return new double[]{root};
        } else { // No real roots
            return new double[0]; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coefficient of x^2 (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter the coefficient of x (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter the constant term (c): ");
        double c = scanner.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 0) {
            System.out.println("No real roots.");
        } else if (roots.length == 1) {
            System.out.println("One real root: " + roots[0]);
        } else {
            System.out.println("Two real roots: " + roots[0] + " and " + roots[1]);
        }

        scanner.close();
    }
}