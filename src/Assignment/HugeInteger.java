package Assignment;

public class HugeInteger {
    private final int[] array = new int[40];

    public HugeInteger(String value) throws NotAnIntegerException {

        parse(value);
    }

    public void parse(String value) throws NotAnIntegerException {
        if (value.length() <= 40 && value.length() > 0) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (Character.isDigit(value.charAt(i))) {
                    array[i] = Character.getNumericValue(value.charAt(i));
                } else {
                    throw new NotAnIntegerException();
                }
            }
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int j : array) {
            result.append(j);
        }
        return result.toString();
    }

    public HugeInteger add(HugeInteger hugeInteger) throws NotAnIntegerException {

        int sum;
        int carry = 0;

        for (int i = array.length - 1; i >= 0; i--) {

            sum = this.array[i] + hugeInteger.array[i] + carry;
            if (sum > 9) {
                sum = sum - 10;
                carry = 1;
            } else {
                carry = 0;
            }
            array[i] = sum;
        }

        return HugeInteger.this;

    }

    public HugeInteger subtract(HugeInteger hugeInteger) {

        int difference;
        int borrow = 0;

        for (int i = array.length - 1; i >= 0; i--) {

            difference = this.array[i] - hugeInteger.array[i] - borrow;
            if (difference >= 0) {
                borrow = 0;
            } else {
                difference += 10;
                borrow = 1;
            }
            array[i] = difference;
        }

        return HugeInteger.this;
    }

    public boolean isEqualTo(HugeInteger hugeInteger) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] != hugeInteger.array[i]) {
                return false;
            }
        }

        return true;
    }

    public boolean isNotEqualTo(HugeInteger hugeInteger) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] != hugeInteger.array[i]) {
                return true;
            }
        }
        return false;
    }

    public static class NotAnIntegerException extends Throwable {
        public NotAnIntegerException() {
        }
    }
}
