class EarthVolumeCalculator {
    public static void main(String[] args) {
        // Radius of Earth in kilometers
        double radiusKilometers = 6378;
        // Conversion factor from cubic kilometers to cubic miles
        double kilometersToMiles = 0.621371;
        // Calculating volume of Earth in cubic kilometers
        double volumeKilometers3 = (4 * Math.PI * Math.pow(radiusKilometers, 3))/3;
        // Converting volume to cubic miles
        double volumeMiles3 = volumeKilometers3 * Math.pow(kilometersToMiles, 3);
        // Output result 2.39568 
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKilometers3 + " and cubic miles is " + volumeMiles3);
    }
}
