package Assignment;

import java.util.Scanner;
public class MinutesToYearsConverter{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Minutes:  "); 
	int minute1 = input.nextInt();

	int hours;
	hours = 24;
	int minutes;
	minutes = 60;
	int sum;
	sum = minute1 / hours / minutes;
	int days = (minute1 / 60 / 24) / 365;

	System.out.print(minute1);
	System.out.printf(" minutes is approxiamtely %d%s %d%s ", sum , "year(s)",  days , "day(s)");





}
}