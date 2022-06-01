package Chapter3;

import java.util.Scanner;

public class ClockDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Clock clock = new Clock(0,0,0);

        System.out.println("Enter hour(s): ");
        int hour = input.nextInt();

        System.out.println("Enter minute(s): ");
        int minute = input.nextInt();

        System.out.println("Enter second(s): ");
        int second = input.nextInt();

        clock.setHour(hour);
        clock.setMinute(minute);
        clock.setSecond(second);

        String time = clock.displayTime();
        System.out.println(time);
    }
}
