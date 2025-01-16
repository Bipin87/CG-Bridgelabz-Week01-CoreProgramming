import java.util.Scanner;

public class ChocolatesDistribution {

    public static int[] distributeChocolates(int numberOfChocolates, int numberOfChildren) {
        // Check for division by zero (zero children)
        if (numberOfChildren == 0) {
            System.out.println("Error: Cannot divide among zero children.");
            return null;
        }

        int chocolatesPerChilds = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        int[] result = {chocolatesPerChilds, remainingChocolates};
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        int[] distribution = distributeChocolates(numberOfChocolates, numberOfChildren);

        if (distribution != null) {
            System.out.println("Each child gets: " + distribution[0] + " chocolates");
            System.out.println("Remaining chocolates: " + distribution[1]);
        }

        input.close();
    }
}