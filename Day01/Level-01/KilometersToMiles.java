class KilometersToMiles {
    public static void main(String[] args) {
        // Conversion factor
        final double KM_TO_MILES = 0.621371;
        // Distance in kilometers
        double distanceKm = 10.8;
        // Conversion to miles
        double distanceMiles = distanceKm * KM_TO_MILES;
        // Output result
        System.out.println("The distance  " + distanceKm +"km in miles is  "+ distanceMiles);
    }
}
