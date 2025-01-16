// import the Scanner class for a User Input
import java.util.Scanner;
class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first Number1:");
        double number1 = input.nextDouble();
        System.out.println("Enter the Second Number2:");
        double number2 = input.nextDouble();
        double result1 = addition(number1, number2);
        System.out.println("Addition of Two Numbers:" + result1);
        double result2 = subtraction(number1, number2);
        System.out.println("Subtraction of Two Numbers:" + result2);
        double result3 = multiplication(number1, number2);
        System.out.println("Multiplication of Two Numbers:" + result3);
        double result4 = division(number1, number2);
        System.out.println("Division of Two Numbers:" + result4);
    }
public static double addition(double number1,double number2){
    return number1 + number2;}
public static double subtraction(double number1,double number2){
    return number1 - number2;}
public static double multiplication(double number1,double number2){
    return number1 * number2;}
public static double division(double number1,double number2){
    return number1 / number2;}

}
