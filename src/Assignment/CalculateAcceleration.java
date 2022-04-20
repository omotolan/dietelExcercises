package Assignment;

import java.util.Scanner;
public class CalculateAcceleration{
	public static void main(String[]args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the starting velocity in meters per second:  ");
	double velocity = input.nextDouble();

	System.out.print("Enter the ending velocity in meters per second:  ");
	double velocity1 = input.nextDouble();

	System.out.print("Enter time in seconds:  ");
	double time = input.nextDouble();

	double sum = (velocity1 - velocity) / time;

	System.out.print("The average acceleration is:  ");
	System.out.print(sum);
}
}