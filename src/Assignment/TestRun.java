package Assignment;


import java.util.Scanner;

public class TestRun {
    Scanner input = new Scanner(System.in);
    public void all4Triangles(int number1, int number2, int number3, String whatToPrint){
        for (int i = 1; i <= number1; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(whatToPrint);
            }
            System.out.println();
        }
        System.out.println();

        for (int k = 10; k >= number2; k--)
        {
            for ( int l = 1; l <= k; l++)
            {
                System.out.print(whatToPrint);
            }
            System.out.println();
        }


        for (int m = 10; m >= number3; m--)
        {
            for (int n = 1; n <=10- m; n++)
            {
                for(int o =1; o<=m; o++) {
                    System.out.print(whatToPrint);
                }
            }
            System.out.println();
        }
    }
    public void barChart(int number4, int number5, int number6, int number7, int number8, String whatToPrint){
        for (int a=1; a<=number4; a++){
            if(a<=30){System.out.print("*");}
        }
        System.out.println();
        for (int  b=1; b<=number5; b++){
            if(b<=30){System.out.print("*");}
        }
        System.out.println();
        for (int c=1; c<=number6; c++){
            if(c<=30){System.out.print("*");}
        }
        System.out.println();
        for (int d=1; d<=number7; d++){
            if(d<=30){System.out.print("*");}
        }
        System.out.println();
        for (int e=1; e<=number8; e++){
            if(e<=30){System.out.print("*");}
        }
        System.out.println();

    }

    public static void main(String[] args) {
        TestRun triangle = new TestRun();
        triangle.all4Triangles(7,1,10,"*");

        System.out.println();

        TestRun barChart = new TestRun();
        System.out.println("number for barchart should be between 0 to 30");
        barChart.barChart(7,27,16,9,30, "A");




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

