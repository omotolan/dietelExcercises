package Chapter5;

public class DivisibleBy3 {
    public static void main(String[] args) {
        divisibleByThree();

    }

    public static void divisibleByThree() {
        int sum = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
