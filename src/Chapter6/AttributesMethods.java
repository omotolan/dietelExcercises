package Chapter6;

import java.util.Scanner;

public class AttributesMethods {
    private static int size;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length: ");
        size = input.nextInt();

        AttributesMethods attributesMethods = new AttributesMethods();
        attributesMethods.setSize(size);
        System.out.println(attributesMethods.getSize());


    }

    public int getSize() {
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }
}
