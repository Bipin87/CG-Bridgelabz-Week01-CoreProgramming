class CourseFeeDiscount {
    public static void main(String[] args) {
        // Fee and discount percentage
        double fee = 125000;
        double discountPercentage = 10;
        // Calculating discount amount and final discounted fee
        double discount = (fee * discountPercentage) / 100;
        double discountedFee = fee - discount;
        // Output result
        System.out.println("The discount amount is INR "+ discount + " and final discounted fee is INR " + discountedFee);
    }
}
