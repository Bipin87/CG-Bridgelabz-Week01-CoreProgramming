// import the Scanner class for a User Input
import java.util.Scanner;
class HeightConversion{
   public static void main(String [] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the Height in cm:");
       double height = input.nextDouble();
       // 1 foot = 12 inches and 1 inch = 2.54 cm
       double oneFoot = 12; double oneInch = 2.54;
       double heightInInch = height / 2.54;
       double heightInFoot = heightInInch / 12;
       System.out.println("Your Height in cm is " + height + " while in feet is " + heightInFoot + " and inches is " + heightInInch);
   }
}
