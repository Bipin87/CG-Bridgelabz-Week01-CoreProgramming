import java.util.Scanner;
public class Anagram8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine().toLowerCase();

        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine().toLowerCase();

        if (areAnagrams(string1, string2)) {
            System.out.println(string1 + " and " + string2 + " are anagrams.");
        } else {
            System.out.println(string1 + " and " + string2 + " are not anagrams.");
        }
		scanner.close();
    }

    public static boolean areAnagrams(String string1, String string2) {
        // check if lengths are equal
        if (string1.length() != string2.length()) {
            return false;
        }

        // create frequency arrays
        int[] charCount1 = new int[256]; // Assuming ASCII characters
        int[] charCount2 = new int[256];

        // calculate character frequencies
        for (char c : string1.toCharArray()) {
            charCount1[c]++;
        }
        for (char c : string2.toCharArray()) {
            charCount2[c]++;
        }

        // Compare frequencies
        for (int i = 0; i < 256; i++) {
            if (charCount1[i] != charCount2[i]) {
                return false;
            }
        }

        return true;
    }
}