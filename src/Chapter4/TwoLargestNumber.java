package Chapter4;

import java.util.Scanner;

public class TwoLargestNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int counter = 0;
        int largestNumber = 0;
        int secondLargestNumber = 0;
        int numbers;
        while (counter < 5) {
            System.out.println("Enter numbers: ");
            numbers = keyboard.nextInt();
            counter++;
            if (numbers > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = numbers;
            } else if (numbers > secondLargestNumber) {
                secondLargestNumber = numbers;
            }

        }
        System.out.println("largest number is: "+largestNumber);
        System.out.println("second largest number is: "+ secondLargestNumber);
    }
}
