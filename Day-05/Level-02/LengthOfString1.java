import java.util.Scanner;

public class LengthOfString1{

	//create a method to count the length of the string
	public static void countLength(String str){
		int index = 0;
		int count = 0;
		
		// use try catch to caught runtime exception                    
		try{
			while(true){
				char ch = str.charAt(index);
				count++;
				index++;
			}
		}catch(RuntimeException e){
			System.out.println("RuntimeException Caught str contains "+ count + " characters \n"+ e.getMessage() );
		}
		
		
	}
	public static void main(String args[]){

		//create an instance of scanner class

		Scanner input = new Scanner(System.in);

		//get input string from user

		System.out.println("Enter your string: ");

		String str = input.nextLine().trim();
		countLength(str);

		input.close();
	}

}