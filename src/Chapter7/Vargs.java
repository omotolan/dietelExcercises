package Chapter7;

public class Vargs {
    // when you know methods can have varying length parameter
    // has to be the last argument in the argument list
    public int add(int... numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total;
    }
}
