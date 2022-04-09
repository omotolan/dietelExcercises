package Chapter3;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(01, 01,2000);

        // using methods
        date.setMonth(04);
        System.out.println(date.getMonth());
        date.setDay(9);
        System.out.println(date.getDay());
        date.setYear(2022);
        System.out.println(date.getYear());
        date.displayDate();
        System.out.println("today's date is " + date.displayDate());
    }
}
