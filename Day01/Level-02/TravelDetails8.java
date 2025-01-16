import java.util.Scanner;
class TravelDetails8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: User details
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the city you are starting from: ");
        String fromCity = scanner.nextLine();
        System.out.print("Enter the city you are traveling via: ");
        String viaCity = scanner.nextLine();
        System.out.print("Enter your final destination city: ");
        String toCity = scanner.nextLine();
        // Input: Distances in miles
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = scanner.nextDouble();
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = scanner.nextDouble();
        // Input: Travel times
        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (in hours): ");
        double timeFromToVia = scanner.nextDouble();
        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " (in hours): ");
        double timeViaToFinalCity = scanner.nextDouble();
        // Compute total distance and time
        double totalDistance = fromToVia + viaToFinalCity;
        double totalTime = timeFromToVia + timeViaToFinalCity;
        // Output the results
        System.out.println("Traveler Name: " + name);
        System.out.println("Routes: " + fromCity + ", " + viaCity + ", " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Total Travel Time: " + totalTime + " hours");
        scanner.close();
    }
}
