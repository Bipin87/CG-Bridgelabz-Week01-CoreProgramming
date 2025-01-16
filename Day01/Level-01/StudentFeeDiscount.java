// import the Scanner class for a User Input
import java.util.Scanner;
class StudentFeeDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Fee amount: ");
        double fee = input.nextDouble();
        System.out.println("Enter The Discount Percent: ");
        double discountPercent = input.nextDouble();
        // Calculating discount amount and final discounted fee
        double discount = (fee * discountPercent) / 100;
        double discountedFee = fee - discount;
        // Output result
        System.out.println("The discount amount is INR "+ discount + " and final discounted fee is INR " + discountedFee);
    }
}

