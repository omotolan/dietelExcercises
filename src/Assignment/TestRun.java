package Assignment;


import java.util.Scanner;

public class TestRun {
    Scanner input = new Scanner(System.in);
    public void all4Triangles(int i, int j, int k, int l, int m, int n,int o, String whatToPrint){
        for (i = 1; i <= 10; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(whatToPrint);
            }
            System.out.println();
        }
        System.out.println();

        for ( k = 10; k >= 1; k--)
        {
            for ( l = 1; l <= k; l++)
            {
                System.out.print(whatToPrint);
            }
            System.out.println();
        }


        for ( m = 10; m >= 1; m--)
        {
            for ( n = 1; n <=10- m; n++)
            {
                for( o =1; o<=m; o++) {
                    System.out.print(whatToPrint);
                }
            }
            System.out.println();
        }
    }
    public void barChart(int a, int b, int c, int d, int e, String whatToPrint){
        for (a=1; a<=2; a++){
            if(a<=30){System.out.print("*");}
        }
        System.out.println();
        for ( b=1; b<=17; b++){
            if(b<=30){System.out.print("*");}
        }
        System.out.println();
        for ( c=1; c<=24; c++){
            if(c<=30){System.out.print("*");}
        }
        System.out.println();
        for ( d=1; d<=5; d++){
            if(d<=30){System.out.print("*");}
        }
        System.out.println();
        for ( e=1; e<=9; e++){
            if(e<=30){System.out.print("*");}
        }
        System.out.println();

    }

    public static void main(String[] args) {
        TestRun triangle = new TestRun();
        triangle.all4Triangles(1,1,10,1,10,1, 1,"*");

        System.out.println();

        TestRun barChart = new TestRun();
        barChart.barChart(1,1,1,1,1, "A");




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

