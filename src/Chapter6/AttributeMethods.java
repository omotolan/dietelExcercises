package Chapter6;

import java.util.Scanner;

public class AttributeMethods {
    private static int size;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length: ");
        size = input.nextInt();

        AttributeMethods attributeMethods = new AttributeMethods();
        attributeMethods.setSize(size);
        System.out.println(attributeMethods.getSize());


    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
