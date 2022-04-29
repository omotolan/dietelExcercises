package Chapter5;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a rangr brtween 1 - 100: ");
        int range = input.nextInt();
        sumOfSeriesOfNumbers(range);

    }

    public static void sumOfSeriesOfNumbers(int range) {
        int sum = 0;
        for (int i = 1; i <= range; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}

