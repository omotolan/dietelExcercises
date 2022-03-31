package Assignment;
import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
       /* int num1, num2;
        num2 = 6;
        System.out.print("Enter value ");
        num1 = keyboard.nextInt();
        num1 = num1 + 2;
        num2 = num1 / num2;
        System.out.println("result = " + num2);*/
           /* int x, y, z;
            x = 5;
            y = x + 2;
            x = 10;
            z = y * x;
            System.out.print(z);*/

        // declare variables
       /* int x, y, z;
// enter values
        System.out.print("Enter value for x ");
        x = keyboard.nextInt();

        System.out.print("Enter value for y ");
        y = keyboard.nextInt();
// code attempting to swap two variables
        z = x;
        x = y;
        y = z;
//display results
        System.out.println("x = " + x);
        System.out.println("y = " + y);*/


           /* System.out.print("enter price");
            int a =keyboard.nextInt();
            System.out.print("enetr tax");
            int b = keyboard.nextInt();

            int price = a * (1 + b/100);
            System.out.print(price);*/

        /*System.out.print("enter number of students: ");
        int students = keyboard.nextInt();
        int size = 7;

        int groups = students / 7;
        int noG = students % 7;

        System.out.println(groups);
        System.out.print((noG));

        final double pi = 3.1416;
        int radius;

        System.out.print("Enter radius: ");
        radius = keyboard.nextInt();
        double area = pi * (radius * radius);
        double circumference = 2 * (pi * radius);
        System.out.print("area of the circles is" + area);
        System.out.printf("circumderence of the circle is %f%n", circumference);
*/

       /* double price = 10.00;
        int age;
        // Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = keyboard.nextInt();
// code to reduce ticket price for children goes here
        if (age < 14) {
            price = price / 2;
            System.out.println("Ticket price = " + price);
        }*/
//        int x;
//        System.out.print("Enter a number: ");
//        x = keyboard.nextInt();
//        if (x > 10)
//
//            System.out.println("Green");
//        System.out.println("Blue");
//
//        System.out.println("Red");
//        for (int i = 21; i >20; i=i+1) // loop to repeat 5 times
//
//        {
//            System.out.println(i); // instruction to display one row
//
//        }

        String word = "tolani";
        for(int i = 0; i<=word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }

}
