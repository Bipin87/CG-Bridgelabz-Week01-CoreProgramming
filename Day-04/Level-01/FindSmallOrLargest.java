import java.util.*;
public class FindSmallOrLargest{
  //create a method and there type is Array
   static int[]findSmallestAndLargest(int number1,int number2, int number3){
      int smallNumber=number1;//set the value of basis of number1 
      int largeNumber=number1;
      if (largeNumber<number2){
       largeNumber=number2;
   }
       else if (largeNumber<number3){
       largeNumber=number3;
   }
   
        
      if (smallNumber>number2){
       smallNumber=number2;
   }
        else if (smallNumber>number3){
       smallNumber=number3;
   }
     // return the array 
     //new keyword use to dynamic memory allocation in runtime
       
      return new int[]{smallNumber,largeNumber};
}
  
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
      // take input from user
	  System.out.print("Enter the number: ");
     int number1=sc.nextInt();
	 System.out.print("Enter the number: ");
     int number2=sc.nextInt();
	  System.out.print("Enter the number: ");
      int number3=sc.nextInt();
     // call method and make new Array temp 
      int [] temp=findSmallestAndLargest(number1,number2,number3);
     System.out.println("Smallest number is :"+temp[0]+ " largest numer is :"+temp[1]);
  }
}