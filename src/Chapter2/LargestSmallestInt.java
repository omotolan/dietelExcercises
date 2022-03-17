package Chapter2;

import java.util.Scanner;

public class LargestSmallestInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a = input.nextInt();

        System.out.println("Enter number: ");
        int b = input.nextInt();

        System.out.println("Enter number  ");
        int c = input.nextInt();

        System.out.println("Enter number: ");
        int d = input.nextInt();

        System.out.println("Enter number: ");
        int f = input.nextInt();

        if (a<b && a<c && a<d && a<f){
            System.out.printf("%d is the smallest %n", a);
        }
        if (b<a && b<c && b<d && b<f){
            System.out.printf("%d is the smallest %n", b);
        }
        if (c<a && c<b && c<d && c<f){
            System.out.printf("%d is the smallest %n", c);
        }
        if (d<a && d<b && d<c && d<f){
            System.out.printf("%d is the smallest %n", d);
        }
        if (f<a && f<b && f<c && f<d){
            System.out.printf("%d is the smallest %n", f);
        }

        if (a>b && a>c && a>d && a>f){
            System.out.println(a + " is the largest");
        }
        if (b>a && b>c && b>d && b>f){
            System.out.println(b + " is the largest");
        }
        if (c>a && c>b && c>d && c>f){
            System.out.println(c + " is the largest");
        }
        if (d>a && d>b && d>c && d>f){
            System.out.println(d + " is the largest");
        }
        if (f>a && f>b && f>c && f>d){
            System.out.println(f + " is the largest");
        }
    }
}
