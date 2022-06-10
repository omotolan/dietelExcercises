package Assignment;

import java.util.Arrays;

public class HugeInteger {
    private final int ARRAY_SIZE = 40;
    private final int[] array;

    public HugeInteger() {
        array = new int[ARRAY_SIZE];
    }

    public int[] parse(String data) throws NotAnIntegerException {
        if (data.length() <= ARRAY_SIZE && data.length() > 0) {
            //  for (int i = 0; i < data.length(); i++) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (Character.isDigit(data.charAt(i))) {
                    array[i] = Character.getNumericValue(data.charAt(i));
                } else {
                    throw new NotAnIntegerException("value at index: " + i + " not an integer.");
                }

            }
            System.out.println(Arrays.toString(array));
        }
        return array;
    }

    public String addition(String data, String data2) throws NotAnIntegerException {
        int sum = 0;
        int carry = 0;
        int[] nu = parse(data);
        int[] num = parse(data2);


        for (int i = num.length - 1; i >= 0; i--) {

            sum = nu[i] + num[i] + carry;
            if (sum <= 9) {
                array[i] = sum;
                carry = 0;
            } else {
                // carry = sum / 10;
                sum = sum - 10;

                carry = 1;
                array[i] = sum;
            }

        }
        System.out.println(Arrays.toString(array));
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
        // return number;
    }


    public int subtraction(String firstString, String secondString) {


        return 0;

    }

    public String toString(int[] number) {
        for (int j : number) {
            return String.format("%d", j);
        }
        return null;
    }




    public class NotAnIntegerException extends Throwable {
        public NotAnIntegerException(String s) {
        }
    }



}
