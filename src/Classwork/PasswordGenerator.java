package Classwork;

import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        char[] password = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J','K', 'L', 'M',
                'N', 'O', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0','n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                'P', 'Q','R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        Random random = new Random();

        for(int i = 0; i<13; i++){
            String myPass = String.valueOf(password[random.nextInt(i + ' ')]);
            System.out.print(myPass);
        }
    }
}
