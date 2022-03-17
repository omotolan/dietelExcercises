package Assignment;

import java.util.Scanner;
public class ConvertFeetToMeters{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a value for feet:  ");
	double feet = input.nextDouble();

	double constant;
	constant = 0.305;
	double sum = feet * constant;

	System.out.print(feet);
	System.out.print(" feet is ");
	System.out.print(sum);
	System.out.print(" meters");

}
}