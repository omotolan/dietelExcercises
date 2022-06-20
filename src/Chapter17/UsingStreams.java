package Chapter17;

import java.util.stream.IntStream;

public class UsingStreams {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i <= 10; i++) {
            total += i;
        }
        System.out.println(total);
        //substitutes the for loop. tells what to do rather than how to do it
        System.out.println(IntStream.rangeClosed(1, 10)
                .sum());

        System.out.println();
        System.out.println(IntStream.rangeClosed(1, 10)
                .map((int x) -> {return x * 2;})
                .sum());

        System.out.println(IntStream.rangeClosed(5, 25).count());
        System.out.println();
        // filter for conditional statements
        System.out.println(IntStream.rangeClosed(1, 10)
                .filter(x -> x % 2 == 0)
                .map(x -> x * 3)
                .sum());

    }
}
