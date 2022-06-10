package Assignment;

public class HugeInteger {
    private final int ARRAY_SIZE = 40;
    private final int[] array;

    public HugeInteger() {
        array = new int[ARRAY_SIZE];
    }

    public int[] parse(String data) throws NotAnIntegerException {
        if (data.length() <= ARRAY_SIZE && data.length() > 0) {
            for (int i = 0; i < array.length; i++) {
                //  for (int i = array.length - 1; i >= 0; i--) {
                if (Character.isDigit(data.charAt(i))) {
                    array[i] = Character.getNumericValue(data.charAt(i));
                } else {
                    throw new NotAnIntegerException("value at index: " + i + " not an integer.");
                }

            }
        }
        return array;
    }

    private void insert(int index, int number) {
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = number;
        }
    }

    public String addition(String data, String data2) throws NotAnIntegerException {
        int sum;
        int carry = 0;
        int[] firstArray = parse(data);
        int[] secondArray = parse(data2);


        for (int i = array.length - 1; i >= 0; i--) {

            sum = firstArray[i] + secondArray[i] + carry;
            System.out.print(sum + " ");
            if (sum <= 9) {

                carry = 0;

            } else {
                carry = 1;
                sum -= 10;
            }
            array[i] = sum;

        }

        StringBuilder result = new StringBuilder();
        for (int j : array) {
            result.append(j);
        }
        return result.toString();

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


    public static class NotAnIntegerException extends Throwable {
        public NotAnIntegerException(String s) {
        }
    }


}
