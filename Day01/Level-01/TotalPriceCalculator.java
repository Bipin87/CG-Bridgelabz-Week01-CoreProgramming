import java.util.Scanner;
class TotalPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: unit price and quantity
        System.out.print("Enter the unit price of the item (in INR): ");
        double unitPrice = scanner.nextDouble();
        System.out.print("Enter the quantity to be bought: ");
        int quantity = scanner.nextInt();
        // Calculate the total price
        double totalPrice = unitPrice * quantity;
        // Output the result
        System.out.println("The total purchase price is " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
        scanner.close();
    }
}
