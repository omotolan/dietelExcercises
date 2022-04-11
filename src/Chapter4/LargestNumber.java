package Chapter4;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int counter = 0;
        int largestNumber = 0;
        int numbers;
        while (counter < 10 ){
            System.out.println("Enter numbers: ");
            numbers = keyboard.nextInt();
            counter++;
            if(numbers>largestNumber){
                largestNumber = numbers;
            }

        }
        System.out.println(largestNumber);
        }

    }

