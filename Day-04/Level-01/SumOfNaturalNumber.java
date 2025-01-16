import java.util.*;
public class SumOfNaturalNumber{
	// sum of natural number
    static int sumOfNaturalNum(int number){
        int sum=0;
        for (int i=1;i<=number;++i){
            sum +=i;
        }
        return sum;
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
		// user input
		System.out.print("Enter the number: ");
        int number=sc.nextInt();
        int result=sumOfNaturalNum(number);
		// Printing the result
        System.out.println("sum is N natural number "+number+" is :"+result);
    }
}