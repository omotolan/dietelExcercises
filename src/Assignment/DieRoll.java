package Assignment;

import java.util.Random;

public class DieRoll {
    public static void main(String[] args) {
        Random dice = new Random();
        int firstDie = 1 + dice.nextInt(6);
        int secondDie = 1 + dice.nextInt(6);
        int sum = firstDie + secondDie;

        System.out.println(firstDie);
        System.out.println(secondDie);
        System.out.println("sum of the two die is: " + sum);
        if(sum == 7 || sum == 11){
            System.out.println("you win!");
        }
        else if (sum == 2 || sum == 3 || sum == 12){
            System.out.println("you lost!");
        }
        else{
            System.out.println("point");
            int firstDie1 = 1 + dice.nextInt(6);
            int secondDie2 = 1 + dice.nextInt(6);
           // int point = sum;
           int newSum = firstDie1 + secondDie2;
           if(newSum == 7){
               System.out.println("you lose");
           }
           else {
               System.out.println("you win");
           }
        }
    }
}
