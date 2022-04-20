package Chapter8;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second) {
        validate(hour, minute, second);

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void validate(int hour, int minute, int second) {
        /*
        if (hour < 0 || hour > 24) {
            throw new IllegalArgumentException("Invalid hour");
        } */
        //validate hour
        boolean hourIsValid = hour < 0 || hour > 24;
        if (hourIsValid) {
            throw new IllegalArgumentException("Invalid hour");
        }
        // validate minute
        boolean minuteIsValid = minute < 0 || minute >= 60;
        if (minuteIsValid) {
            throw new IllegalArgumentException("Invalid minute");
        }
        // validate second
        boolean secondIsValid = second < 0 || second >= 60;
        if (secondIsValid) {
            throw new IllegalArgumentException("Invalid seconds");
        }

    }
}
