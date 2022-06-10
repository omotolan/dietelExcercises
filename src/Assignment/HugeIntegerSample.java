package Assignment;

public class HugeIntegerSample {
    private final int ARRAY_SIZE = 40;
    private final int[] array;

    public HugeIntegerSample() {
        array = new int[ARRAY_SIZE];
    }

    public int[] parse(String data) throws NotAnIntegerException {
        int[] array = new int[40];
        if (data.length() <= array.length && data.length() > 0) {
            // for (int i = 0; i < array.length; i++) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (Character.isDigit(data.charAt(i))) {
                    array[i] = Character.getNumericValue(data.charAt(i));
                } else {
                    throw new NotAnIntegerException("value at index: " + i + " not an integer.");
                }

            }
        }
        return array;
    }

    public String addition(String data, String data2) throws NotAnIntegerException {
        int sum;
        int carry = 0;
        int[] firstArray = parse(data);
        int[] secondArray = parse(data2);

        for (int i = array.length - 1; i >= 0; i--) {

            sum = firstArray[i] + secondArray[i] + carry;

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


    public String subtraction(String firstString, String secondString) throws NotAnIntegerException {
        int borrow = 0;
        int subtraction = 0;
        int[] firstArray = parse(firstString);
        int[] secondArray = parse(secondString);

        for (int i = array.length - 1; i >= 0; i--) {

            subtraction = firstArray[i] - secondArray[i] - borrow;

            if (subtraction >= 0) {
                borrow = 0;
            } else {
                subtraction += 10;
                borrow = 1;
            }
            array[i] = subtraction;
        }
        StringBuilder result = new StringBuilder();
        for (int j : array) {
            result.append(j);
        }
        return result.toString();

    }

    public boolean isZero(String data) throws NotAnIntegerException {
        int[] a = parse(data);
        int[] array = parse(data);

        for (int k : array) {

            if (k != 0) {
                return false;
            }
        }

        return true;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int j : array) {
            result.append(j);
        }
        return result.toString();
    }


    public static class NotAnIntegerException extends Throwable {
        public NotAnIntegerException(String s) {
        }
    }


}
