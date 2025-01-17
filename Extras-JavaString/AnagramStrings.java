
import java.util.Scanner;

public class AnagramStrings{
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        // Check if sorted strings are equal
        for(int i = 0; i < str1.length(); i++) {
            int count = 0;
            for(int j = 0; j < str2.length(); j++) {
                if(str1.charAt(i) == str2.charAt(j)) {
                    count++;
                }
            }

            if(count == 0) {
                return false;
            }
        }

        return true;
                
                
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input strings from user
        System.out.println("Enter the first string: ");
        String str1 = input.nextLine().trim();
        System.out.println("Enter the second string: ");
        String str2 = input.nextLine().trim();
        // Check if strings are anagrams or not
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams of each");
        }
        else {
            System.out.println(str1 + " and " + str2 + " are not anagrams of");
        }

        input.close();
    }
}