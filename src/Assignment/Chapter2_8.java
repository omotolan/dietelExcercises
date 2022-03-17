package Assignment;

import java.util.Enumeration;
import java.util.Scanner;

public class Chapter2_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*a*/
       /* System.out.print("Enter an integer");
        int a;
        int b = 0;
        int c = 0;
        //a = b * c;
        // sample payroll calculation

        int x = 2, y = 3;
        System.out.printf("x = %d%n", x);
        System.out.printf("Value of %d + %d is %d%n", x, x, (x + x));
        //System.out.printf("x =");
        System.out.printf("%d = %d%n", (x + y), (y + x));

        //19.5
        //3
        //324
        System.out.println("1 2 3 4"); //2.14
        System.out.print("1 2 3 4 ");
        System.out.printf("%d %d %d %d%n", 1, 2, 3, 4);

        System.out.println("Enter an int: "); //2.15
        int firstNumber = input.nextInt();

        System.out.println("Enter second int: ");
        int secondNumber = input.nextInt();

        int add, diff, multiply, division;

        add = firstNumber + secondNumber;
        System.out.printf("addition is %d%n", add);

        diff = firstNumber - secondNumber;
        System.out.printf("substraction is %d%n", diff);


        multiply = firstNumber * secondNumber;
        System.out.printf("multiplication is %d%n", multiply);

        division = firstNumber / secondNumber;
        System.out.printf("division is %d%n", division);

        System.out.println("enter number: "); //2.16
        int thirdNumber = input.nextInt();

        System.out.println("Enter number: ");
        int forthNumber = input.nextInt();

        if (thirdNumber > forthNumber) {
            System.out.printf("%d is larger %n", thirdNumber);
        }
        if (forthNumber > thirdNumber) {
            System.out.printf("%d is larger %n", forthNumber);
        }

        System.out.println("Enter number: "); //2.17
        int fifthNumber = input.nextInt();

        System.out.println("Enter number: ");
        int sixthNumber = input.nextInt();

        System.out.print("Enter number: ");
        int seventhNumber = input.nextInt();

        add = fifthNumber + sixthNumber + seventhNumber;
        System.out.printf("answer is %d%n", add);

        division = (fifthNumber + sixthNumber + seventhNumber) / 3;
        System.out.printf("answer is %d%n", division);

        multiply = fifthNumber * sixthNumber * seventhNumber;
        System.out.printf("answer is %d%n", multiply);

        if (fifthNumber < sixthNumber && fifthNumber < seventhNumber) {
            System.out.println(fifthNumber + "%is the smallest");
        }
        if (sixthNumber < fifthNumber && sixthNumber < seventhNumber) {
            System.out.printf("%d is the smallest number", sixthNumber);
        }
            if (seventhNumber < fifthNumber && seventhNumber < sixthNumber) {
                System.out.println(seventhNumber + "is the smallest mumber");
            }
            if (fifthNumber > sixthNumber && fifthNumber > seventhNumber) {
                System.out.println(fifthNumber + "is the largest");
            }
            if (sixthNumber > fifthNumber && sixthNumber > seventhNumber) {
                System.out.printf("%d is the largest number", sixthNumber);
            }
                if (seventhNumber > fifthNumber && seventhNumber > sixthNumber) {
                    System.out.println(seventhNumber + "is the largest number");
                }*/

           /*     System.out.println("*************"); //2.18
                System.out.println("*           *");
                System.out.println("*           *");
                System.out.println("*           *");
                System.out.println("*           *");
                System.out.println("*           *");
                System.out.println("*           *");
                System.out.println("*           *");
                System.out.println("*           *");
                System.out.println("*           *");
                System.out.println("*************");

        System.out.println("    ***     ");
        System.out.println("  *      *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("  *     *");
        System.out.println("    ***     ");

        System.out.println("  * ");
        System.out.println(" *** ");
        System.out.println("*****");
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");

        System.out.println("         *     ");
        System.out.println("      *     *  ");
        System.out.println("     *       *  ");
        System.out.println("    *          *  ");
        System.out.println("  *             *  ");
        System.out.println("   *           *  ");
        System.out.println("     *        *  ");
        System.out.println("      *      *  ");
        System.out.println("          *     ");


        System.out.println("Enter number: ");
        int d = input.nextInt();

        System.out.println("Enter number: ");
        int e = input.nextInt();

        System.out.println("Enter number  ");
        int f = input.nextInt();

        System.out.println("Enter number: ");
        int g = input.nextInt();

        System.out.println("Enter number: ");
        int h = input.nextInt();

        if (d<e && d<f && d<g && d<h){
            System.out.printf("%d is the smallest %n", d);
        }
        if (e<d && e<f && e<g && e<h){
            System.out.printf("%d is the smallest %n", e);
        }
        if (f<d && f<e && f<g && f<h){
            System.out.printf("%d is the smallest %n", f);
        }
        if (g<d && g<e && g<f && g<h){
            System.out.printf("%d is the smallest %n", g);
        }
        if (h<d && h<e && h<f && h<g){
            System.out.printf("%d is the smallest %n", h);
        }

        if (d>e && d>f && d>g && d>h){
            System.out.println(d + " is the largest");
        }
        if (e>d && e>f && e>g && e>h){
            System.out.println(e + " is the largest");
        }
        if (f>d && f>e && f>g && f>h){
            System.out.println(f + " is the largest");
        }
        if (g>d && g>e && g>f && g>h){
            System.out.println(g + " is the largest");
        }
        if (h>d && h>e && h>f && h>g){
            System.out.println(h + " is the largest");
        }


        System.out.print("enter number"); //2.25
        int i = input.nextInt();

        if(i % 2 == 0) {
            System.out.printf("%d is an even number %n", i);
        }
            if (i % 2 == 1){
                System.out.printf("%d is and odd number %n", i);
        }*/

        //System.out.print("Enter number: ");
         //   int j = input.nextInt();
          //  double k;
         //   k = 0.5;
        //    double l;
         //   l  = j ()
        //System.out.printf("Square root of is %d%n", j);


       /* System.out.println("*************");
        System.out.println(" *************");
        System.out.println("*************");
        System.out.println(" *************");
        System.out.println("*************");
        System.out.println(" *************");
        System.out.println("*************");
        System.out.println(" *************");

          //  int pi= 22/7;
          //  float diameter;
          //  float circumference;
          //  float area
        System.out.printf(" The character %c has the value %d%n", 'A', ((int) 'A')); //2.29
        System.out.printf(" The character %c has the value %d%n", 'B', ((int) 'B'));
        System.out.printf(" The character %c has the value %d%n", 'C', ((int) 'C'));
        System.out.printf(" The character %c has the value %d%n", 'a', ((int) 'a'));
        System.out.printf(" The character %c has the value %d%n", 'b', ((int) 'b'));
        System.out.printf(" The character %c has the value %d%n", 'c', ((int) 'c'));
        System.out.printf(" The character %c has the value %d%n", '0', ((int) '0'));
        System.out.printf(" The character %c has the value %d%n", '1', ((int) '1'));
        System.out.printf(" The character %c has the value %d%n", '2', ((int) '2'));
        System.out.printf(" The character %c has the value %d%n", '$', ((int) '$'));
        System.out.printf(" The character %c has the value %d%n", '*', ((int) '*'));
        System.out.printf(" The character %c has the value %d%n", '+', ((int) '+'));
        System.out.printf(" The character %c has the value %d%n", '/', ((int) '/'));
        System.out.printf(" The character %c has the value %d%n", ' ', ((int) ' '));

        //System.out.println("Enter numbers: ");
        //int m = input.nextInt();

        //System.out.printf();

        System.out.println("number\tsquare\tcube"); //2.31
        int m =0; int m1 = m*m; int m2 = m*m*m;
        System.out.printf("%d\t\t%d\t\t%d\t\t%n", m, m1, m2);
        int  n=1; int n1 = n*n; int n2 = n*n*n;
        System.out.printf("%d\t\t%d\t\t%d\t\t%n", n, n1, n2);
        int o =2; int o1 = o*o; int o2 = o*o*o;
        System.out.printf("%d\t\t%d\t\t%d\t\t%n", o, o1, o2);
        int p =3; int p1 = p*p; int p2 = p*p*p;
        System.out.printf("%d\t\t%d\t\t%d\t\t%n", p, p1, p2);
        int r =4; int r1 = r*r; int r2 = r*r*r;
        System.out.printf("%d\t\t%d\t\t%d\t\t%n", r, r1, r2);
        int s =5; int s1 = s*s; int s2 = s*s*s;
        System.out.printf("%d\t\t%d\t\t%d\t\t%n", s, s1, s2);
        int t =6; int t1 = t*t; int t2 = t*t*t;
        System.out.printf("%d\t\t%d\t\t%d\t\t%n", t, t1, t2);
        int u =7; int u1 = u*u; int u2 = u*u*u;
        System.out.printf("%d\t\t%d\t\t%d\t\t%n", u, u1, u2);
        int v =8; int v1 = v*v; int v2 = v*v*v;
        System.out.printf("%d\t\t%d\t\t%d\t\t%n", v, v1, v2);
        int w =9; int w1 = w*w; int w2 = w*w*w;
        System.out.printf("%d\t\t%d\t\t%d\t\t%n", w, w1, w2);
        int x =10; int x1 = x*x; int x2 = x*x*x;
        System.out.printf("%d\t\t%d\t\t%d\t\t%n", x, x1, x2);

        System.out.println("Enter weight in kilograms: ");
        double weight = input.nextDouble();
        System.out.println("Enter height in meters: ");
        double height = input.nextDouble();

        double BMI = weight / (height * height);
        System.out.println("BMI is:" + BMI);
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 0r greater");*/


        System.out.println("Enter world population digits: "); //2.34
        long population = input.nextLong();
        System.out.print("Enter number of years: " );
        int numberOfYears = input.nextInt();

        double growthRate = 2.53/100;
        int expectedPopulation = (int) (population * growthRate);
        int expectedPopulation1 = (int) (population * growthRate * numberOfYears);
        int expectedPopulation2 = (int) (population * growthRate *numberOfYears);
        int expectedPopulation3 = (int) (population * growthRate *numberOfYears);
        int expectedPopulation4 = (int) (population * growthRate *numberOfYears);

        //numberOfYears <=5;
        if (numberOfYears == 1){
            System.out.printf("population growth rate for a year is: %d%n", expectedPopulation);
        }
        if (numberOfYears == 2){
            System.out.printf("population growth rate for two years is: %d%n", expectedPopulation1);
        }
        if (numberOfYears == 3) {
            System.out.printf("population growth rate for three years is: %d%n", expectedPopulation2);
        }
            if (numberOfYears == 4){
                System.out.printf("population growth rate for four years is: %d%n", expectedPopulation3);
            }
            if (numberOfYears == 5){
                System.out.printf("population growth rate for five years is: %d%n", expectedPopulation4);
            }








    }


    }

