package Assignment;

import java.util.Scanner;
public class Energy{
public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the amount in kilograms:  ");
	double kilogram = input.nextDouble();

	System.out.print("Enter the initial temperature:  ");
	double temperature = input.nextDouble();

	System.out.print("Enter the final temperature:  ");
	double temperature1 = input.nextDouble();

	int constant;
	constant = 4184;

	double sum = kilogram * (temperature1 - temperature) * constant;


	System.out.print("The energy needed is:  ");
	System.out.println(sum);

	}
}