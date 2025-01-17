import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = getInput(scanner);
        boolean isPalindrome = checkPalindrome(input);
        displayResult(input, isPalindrome);
    }
    public static String getInput(Scanner scanner) {
        System.out.println("Enter the an string: ");
        return scanner.nextLine().trim();
    }
    public static boolean checkPalindrome(String input) {
        int left = 0, right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void displayResult(String input, boolean isPalindrome) {
        System.out.println("Is \"" + input + "\" a palindrome? " + isPalindrome);
    }
}
