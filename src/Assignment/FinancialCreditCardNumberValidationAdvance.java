package Assignment;


public class FinancialCreditCardNumberValidationAdvance {

    private int sumOddNumber(int[] array) {
        int oddNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                oddNumber += array[i];
            }
        }
        return oddNumber;
    }

    private int sumEvenNumber(int[] array) {
        int evenNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                int number = array[i] * 2;
                evenNumber += separateNumber(number);

            }
        }
        return evenNumber;
    }

    public int sum(int[] array) {
        int sumEven = sumEvenNumber(array);
        int sumOdd = sumOddNumber(array);
        int number = 0;
        number = sumEven + sumOdd;
        return number;
    }

    public boolean isValid(int number) {
        if (number % 10 == 0) {
            return true;
        }
        return false;
    }

    private int separateNumber(int number) {
        if (number > 9) {
            int new1 = (number % 10);
            int new2 = (number % 100) / 10;
            number = new1 + new2;
        }
        return number;
    }
}
