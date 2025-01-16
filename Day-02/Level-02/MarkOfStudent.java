import java.util.Scanner;
class MarkOfStudent {
    public static void main(String[] args) {
        // creating variable to store the marks of the three subjects
        float physics, chemistry, math;

        // Creating an instance of Scanner
        Scanner input = new Scanner(System.in);
				
		//taking input from user to enter marks in physics
		System.out.print("Enter the marks of physics: ");
		physics = input.nextFloat();
		
		
		//taking input from user to enter marks in chemistry
		System.out.print("Enter the marks of chemistry: ");
		chemistry = input.nextFloat();
		
		//taking input from user to enter marks in math
		System.out.print("Enter the marks of math: ");
		math = input.nextFloat();
		
		float percentageOfStudent = (physics + chemistry + math)/3;
		
		//Computing the grade of the student
		if(percentageOfStudent >= 80){
			System.out.println("Average marks "+ ((physics + chemistry + math)/3) + "\nGrade is A \nRemark is Level-4, above agency-normalized standard");
		}
		else if(percentageOfStudent >= 70 && percentageOfStudent <= 79){
			System.out.println("Average marks "+ ((physics + chemistry + math)/3) + "\nGrade is B \nRemark is Level-3, at agency-normalized standard");
		}
		else if(percentageOfStudent >= 60 && percentageOfStudent <= 69){
			System.out.println("Average marks "+ ((physics + chemistry + math)/3) + "\nGrade is C \nRemark is Level-2, below, but approaching agency-normalized standard");
		}
		else if(percentageOfStudent >= 50 && percentageOfStudent <= 59){
			System.out.println("Average marks "+ ((physics + chemistry + math)/3) + "\nGrade is D \nRemark is Level-1, well below agency-normalized standard");
		}
		else if(percentageOfStudent >= 40 && percentageOfStudent <= 49){
			System.out.println("Average marks "+ ((physics + chemistry + math)/3) + "\nGrade is E \nRemark is Level-1-, too below agency-normalized standard");
		}
		else{
			System.out.println("Average marks "+ ((physics + chemistry + math)/3) + "\nGrade is R \nRemark isRemedial Standards");
		}
		
		
			
        input.close();
	}	
}