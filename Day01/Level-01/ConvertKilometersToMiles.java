// importing the Scanner class
import java.util.Scanner;
class ConvertKilometersToMiles {
    public static void main(String[] args) {
        double km;
        //Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in kilometers: ");
        km = input.nextDouble();
        // 1 mile = 1.6 km
        double oneMile= 1.6;
        double totalMiles = km / oneMile;
        System.out.println("The total miles is " + totalMiles +" mile for the given " + km + " km");
    }
}
