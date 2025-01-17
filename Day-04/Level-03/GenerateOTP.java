import java.util.Random;

public class GenerateOTP {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        Random rand = new Random();
        return rand.nextInt(900000) + 100000; // Generate a random number between 100000 and 999999
    }

    // Method to check if all OTPs in the array are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length - 1; i++) { 
            for (int j = i + 1; j < otps.length; j++) { 
                if (otps[i] == otps[j]) { 
                    return false; // If any two OTPs are the same, return false
                }
            }
        }
        return true; // All OTPs are unique
    }

    public static void main(String[] args) {
        int[] generatedOTPs = new int[10]; // Array to store the generated OTPs

        // Generate 10 OTPs and store them in the array
        for (int i = 0; i < 10; i++) {
            generatedOTPs[i] = generateOTP();
        }

        // Check if all OTPs are unique
        if (areOTPsUnique(generatedOTPs)) {
            System.out.println("All OTPs are unique.");
            for (int otp : generatedOTPs) {
                System.out.println("GeneratedOTP Is:  " + otp); 
            }
        } else {
            System.out.println("Some OTPs are duplicates.");
        }
    }
}