package Assignment.HugeInteger;

public class HugeInteger {
    private final int[] array = new int[40];

    public HugeInteger(String value) throws NotAnIntegerException, ValueLengthGreaterThanForty {

        parse(value);
    }

    public void parse(String value) throws NotAnIntegerException, ValueLengthGreaterThanForty {
        if (value.length() <= 40 && value.length() > 0) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (Character.isDigit(value.charAt(i))) {
                    array[i] = Character.getNumericValue(value.charAt(i));
                } else {
                    throw new NotAnIntegerException("value at index: " + i + " not an integer.");
                }
            }
        } else {
            throw new ValueLengthGreaterThanForty("Value length greater than 40.");
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

        return (!isEqualTo(hugeInteger));
    }

    public boolean isGreaterThan(HugeInteger hugeInteger) {
        int counter = 0;
        while (array[counter] == hugeInteger.array[counter]) {
            counter++;
        }

        return (array[counter] > hugeInteger.array[counter]);

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > hugeInteger.array[i]) {
//                return true;
//            }
//        }
//        return false;
    }

    public boolean isLessThan(HugeInteger hugeInteger) {

        int counter = 0;
        while (array[counter] == hugeInteger.array[counter]) {
            counter++;
        }
        return (array[counter] < hugeInteger.array[counter]);

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < hugeInteger.array[i]) {
//                return true;
//            }
//        }
//        return false;
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger hugeInteger) {

        return isGreaterThan(hugeInteger) || isEqualTo(hugeInteger);
    }

    public boolean isLessThanOrEqualTo(HugeInteger hugeInteger) {

        return isLessThan(hugeInteger) || isEqualTo(hugeInteger);
    }

    public HugeInteger multiply(HugeInteger hugeInteger) {
        // yet to crack
        int multiplication = 0;
        int carry = 0;
        int n = 0;
        for (int j = hugeInteger.array.length - 1; j >= 0; j--) {
            n = hugeInteger.array[j];
        }
        for (int i = array.length - 1; i >= 0; i--) {

            multiplication = array[i] * n;


            if (multiplication <= 9) {
                carry = 0;
            } else {
                carry = multiplication / 10;
                multiplication = multiplication % 10;

            }
            array[i] = multiplication + carry;
        }
        return HugeInteger.this;
    }


}
