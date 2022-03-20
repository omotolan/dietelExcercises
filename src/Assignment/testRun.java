package Assignment;

import jdk.swing.interop.SwingInterOpUtils;

public class testRun {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) // outer loop as before
        {
            for (int j = 1; j <= i; j++) // inner loop to display one row of stars
            {
                System.out.print("*");
            } // inner loop ends here
            System.out.println(); // necessary to start next row on a new line
        } // outer loop ends here


        for (int k = 10; k >= 1; k--) // outer loop as before
        {
            for (int l = 1; l <= k; l++) // inner loop to display one row of stars
            {
                System.out.print("*");
            } // inner loop ends here
            System.out.println(); // necessary to start next row on a new line
        } // outer loop ends here


        for (int m = 10; m >= 1; m--) // outer loop as before
        {
            for (int n = 1; n <=10- m; n++) // inner loop to display one row of stars
            {
                for(int o =1; o<=m; o++) {
                    System.out.print("*");
                }
            } // inner loop ends here
            System.out.println(); // necessary to start next row on a new line
        } // outer loop ends here


      // for(int p=-10; p<=0; p++) {
         //  for (int o = -9; o <= o; o++) // inner loop to display one row of stars
        //   {
         //      System.out.print("*");
         //  } // inner loop ends here
        //   System.out.println();

     //  }
       for (int a=1; a<=2; a++){
           if(a<=30){System.out.print("*");}
       }
        System.out.println();
        for (int b=1; b<=17; b++){
            if(b<=30){System.out.print("*");}
        }
        System.out.println();
        for (int c=1; c<=24; c++){
            if(c<=30){System.out.print("*");}
        }
        System.out.println();
        for (int d=1; d<=5; d++){
            if(d<=30){System.out.print("*");}
        }
        System.out.println();
        for (int e=1; e<=9; e++){
            if(e<=30){System.out.print("*");}
        }
        System.out.println();
    }
}

