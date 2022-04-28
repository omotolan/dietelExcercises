//package Chapter5;
//
//import java.util.Scanner;
//
//public class Small {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter size of numbers you wish to input: ");
//        int numberOfTimes = input.nextInt();
//        int numbers = 0;
//        //int maxNumber = 0;
//        int minNumber = Integer.MAX_VALUE;
//
//        for (int i = 0; i < numberOfTimes; i++) {
//            System.out.println("Enter number: ");
//            numbers = input.nextInt();
//
//            if (numbers < minNumber) {
//                minNumber = numbers;
//
//
//            }
//
//        }
//        System.out.println(minNumber);
//    }
//
//    }
//    stem.out.println("Enter size of numbers you wish to input: ");
//            int numberOfTimes = input.nextInt();
//            int numbers = 0;
//            int maxNumber = 0;
//            int minNumber = Integer.MAX_VALUE;
//            int sum = 0;
//
//
//            for (int i = 0; i < numberOfTimes; i++) {
//        System.out.println("Enter number: ");
//        numbers = input.nextInt();
//        int temp;
//        temp = numbers;
//        if (temp > maxNumber) {
//        maxNumber = temp;
//        }
//        if (numbers < minNumber) {
//        minNumber = numbers;
//        }
//
//        }
//        System.out.println(minNumber);
//        System.out.println(maxNumber);
//        sum = maxNumber + minNumber;
//        System.out.println("sum of the extremes is: " + sum);
