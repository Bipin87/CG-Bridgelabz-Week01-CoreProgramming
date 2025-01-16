import java.util.Random;

public class RandomNumberStarts{
    //Generates an array of 4-digit random integers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(9000) + 1000; // Generate random number between 1000 and 9999
        }
        return numbers;
    }

    //Calculates the average, minimum, and maximum values of an array of integers.
     
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;

        int min = Integer.MAX_VALUE; 
        int max = Integer.MIN_VALUE; 
        for (int number : numbers) {
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int size = 5; // Generate 5 random numbers

        int[] randomNumbers = generate4DigitRandomArray(size);

        double[] stats = findAverageMinMax(randomNumbers);

        System.out.println("Random Numbers:");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
    }
}