package Assignment;

import java.util.Random;

public class DieRoll {
    public static void main(String[] args) {
//        Random dice = new Random();
//        int firstDie = 1 + dice.nextInt(6);
//        int secondDie = 1 + dice.nextInt(6);
//        int sum = firstDie + secondDie;
//
//        System.out.println("value of firstdie " + firstDie);
//        System.out.println("value of seconddie " + secondDie);
//        System.out.println("sum of the two die is: " + sum);
//        if(sum == 7 || sum == 11){
//            System.out.println("you win!");
//        }
//        else if (sum == 2 || sum == 3 || sum == 12){
//            System.out.println("crabs ! you lost!");
//        }
//        else if(sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10){
//            int point = sum;
//            System.out.println("you have a point");
//            for(int i = 0; i<1; i++) {
//                int firstDie1 = 1 + dice.nextInt(6);
//                int secondDie2 = 1 + dice.nextInt(6);
//                int newSum = firstDie1 + secondDie2;
//                System.out.println(newSum);
//                if(newSum == point){
//                    System.out.println("you win1");
//                }
//
//               else if( newSum == 7){
//                   System.out.println("you lose");
//                }
//               else { i++;}
//            }
//        }

        Random dice = new Random();
        int firstThrow = 1 + dice.nextInt(6);
        int secondThrow = 1 + dice.nextInt(6);
        int sum = firstThrow + secondThrow;
        System.out.println(firstThrow+secondThrow);

        if (sum == 7 || sum == 11) {
            System.out.println("you win");
        } else if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("crabs! you lose");
        }
        else if(sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10){
            System.out.println("point");
            int point = sum;
            for(int i = 0; i!=point; i++){
                int firstThrow1 = 1 + dice.nextInt(6);
                int secondThrow1 = 1 + dice.nextInt(6);
                int newSum = firstThrow1 + secondThrow1;
                System.out.println(firstThrow1+secondThrow1);
                if(point == newSum){
                    System.out.println("you winn");
                }
                else if(newSum == 7){
                    System.out.println("you lose");
                }
                else{}

            }
        }
    }
}