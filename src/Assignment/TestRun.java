package Assignment;


import java.util.Scanner;

public class TestRun {
    static Scanner input = new Scanner(System.in);
    public void all4Triangles(int number1, int number2, int number3, int number4, String whatToPrint){
        for (int numberOfRows = 1; numberOfRows <= number1; numberOfRows++)
        {
            for (int numberOfStars = 1; numberOfStars <= numberOfRows; numberOfStars++)
            {
                System.out.print(whatToPrint);
            }
            System.out.println();
        }
        System.out.println();

        for (int numberOfRows1 = 10; numberOfRows1 >= number2; numberOfRows1--)
        {
            for ( int numberOfStars1 = 1; numberOfStars1 <= numberOfRows1; numberOfStars1++)
            {
                System.out.print(whatToPrint);
            }
            System.out.println();
        }


        for (int numberOfRows2 = 1; numberOfRows2 <= number3; numberOfRows2++)
        {
            for(int numberOfSpaces = 2; numberOfSpaces<=numberOfRows2; numberOfSpaces++  ) {
                System.out.print(" ");
            }
                for (int numberOfStars2= 10; numberOfStars2 >= numberOfRows2; numberOfStars2--) {
                    System.out.print("*");
                }

            System.out.println();
        }

        for (int numberOfRows3 = 10; numberOfRows3 >= number4; numberOfRows3--)
        {
            for (int numberOfStars3= 1; numberOfStars3 <= numberOfRows3; numberOfStars3++) {
                System.out.print("*");
            }
            for(int numberOfSpaces1 = 9; numberOfSpaces1>=numberOfRows3; numberOfSpaces1--  ) {
                System.out.print(" ");}
//            for (int numberOfStars3= 1; numberOfStars3 <= numberOfRows3; numberOfStars3++) {
//                System.out.print("*");
//            }
            //  System.out.print("*");

            System.out.println();
        }
    }



    public void barChart(int number5, int number6, int number7, int number8, int number9, String whatToPrint){
        //whatToPrint = "*";
        for (int a=1; a<=number5; a++){
            if(a<=30){System.out.print(whatToPrint);}
        }
        System.out.println();
        for (int  b=1; b<=number6; b++){
            if(b<=30){System.out.print(whatToPrint);}
        }
        System.out.println();
        for (int c=1; c<=number7; c++){
            if(c<=30){System.out.print(whatToPrint);}
        }
        System.out.println();
        for (int d=1; d<=number8; d++){
            if(d<=30){System.out.print(whatToPrint);}
        }
        System.out.println();
        for (int e=1; e<=number9; e++){
            if(e<=30){System.out.print(whatToPrint);}
        }
        System.out.println();

    }

    public static void main(String[] args) {
        TestRun triangle = new TestRun();
        triangle.all4Triangles(7,1,10,1,"*");

        System.out.println();

        TestRun barChart = new TestRun();
        System.out.println("number for barchart should be between 0 to 30");
        barChart.barChart(7,27,16,9,30, "A");


        int z = 10;
        while(z>0){
            z--;
            System.out.print(z+" ");
        }


        System.out.println("enter number: ");
        int numberr = input.nextInt();
        for (int number =1; number <=12; number++) {
                System.out.print(numberr+ " * " + number + " = "+number*numberr);
            }


        int count =1;
        while(count<=12){
            System.out.println(numberr + "*" + count + "=" + count);
            count++;
        }
//        Scanner keyboard = new Scanner (System.in);
//        final int SECRET = 27; // secret number
//        int num; // to hold user's guess
//        boolean guessed = false; // so far number not guessed
//        System.out.println("You have 3 goes to guess the secret number");
//        System.out.println("HINT: It is a number less than 50!");
//        System.out.println();
//// look carefully at this loop
//        for (int i= 1; i <= 3; i++) // loop repeats 3 times
//        {
//            System.out.print("Enter guess: ");
//            num = keyboard.nextInt();
//// check guess
//            if (num == SECRET) // check if number guessed correctly
//            {
//                guessed = true; // record number has been guessed correctly
//                break; // exit loop
//            }
//        }
//// now check to see if the number was guessed correctly or not
//        if (guessed)
//        {
//            System.out.println("Number guessed correctly");
//        }
//        else
//        {
//            System.out.println("Number NOT guessed");
//        }
    }
}

