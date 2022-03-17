package Assignment;

import java.util.Scanner;
public class LenghtNeededForTake_off{
 	public static void main(String[]args){
	Scanner input = new Scanner (System.in);

	System.out.print("Enter speed in meters per second:  ");
	double speed = input.nextDouble();

	System.out.print("Enter acceleration in meters per second:  ");
	double acceleration = input.nextDouble();
	
	double acceleration1;
	acceleration1 = 2 * acceleration;
	double speed1 = speed * speed;
	double sum = speed1 / acceleration1;

	System.out.print("The minimum runway lenght for this airplane is:  ");
	System.out.println(sum);
	}
}