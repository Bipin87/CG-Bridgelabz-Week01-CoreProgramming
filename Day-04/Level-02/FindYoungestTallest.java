import java.util.*;

public class FindYoungestTallest {

    public static int findYoungest(int[] ages) {
        int youngest = ages[0]; 
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngest) {
                youngest = ages[i];
            }
        }
        return youngest;
    }

    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] ages = new int[3];
        int[] heights = new int[3];

        System.out.println("Enter ages of Amar, Akbar, and Anthony:");
        for (int i = 0; i < 3; i++) {
			
            ages[i] = input.nextInt();
        }

        System.out.println("Enter heights of Amar, Akbar, and Anthony (in cms):");
        for (int i = 0; i < 3; i++) {
            heights[i] = input.nextInt();
        }

        int youngestAge = findYoungest(ages);
        int tallestHeight = findTallest(heights);

        System.out.println("Youngest friend's age: " + youngestAge);
        System.out.println("Tallest friend's height: " + tallestHeight);

        
    }
}