package Assignment;

import java.util.Scanner;
public class ConvertPoundsToKilogram{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number in pounds:  ");
	double pound = input.nextDouble();

	double pound1;
	pound1 = 0.454;
	double sum = pound * pound1;

	System.out.print(pound);
	System.out.print("pounds is ");
	System.out.print(sum);
	System.out.print(" Kilograms");

	}
}