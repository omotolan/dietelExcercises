package Chapter8;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        validate(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public Time() {
        this(0,0, 0);
    }

    public Time(int minute, int second) {
        /*validateMinute(minute);
        validateSecond(second);
        this.hour = 0;
        this.minute = minute;
        this.second = second;*/
        this(0, minute, second);
    }

    public Time(int second) {
        /*validateSecond(second);
        this.hour = 0;
        this.minute = 0;
        this.second = second;*/
        this(0, 0, second);
    }

    public void setTime(int hour, int minute, int second) {
        validate(hour, minute, second);

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void validate(int hour, int minute, int second) {
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
    }

    private void validateHour(int hour) {
        /*
        if (hour < 0 || hour > 24) {
            throw new IllegalArgumentException("Invalid hour");
        } */
        boolean hourIsValid = hour < 0 || hour > 24;
        if (hourIsValid) {
            throw new IllegalArgumentException("Invalid hour");
        }
    }

    private void validateMinute(int minute) {
        boolean minuteIsValid = minute < 0 || minute >= 60;
        if (minuteIsValid) {
            throw new IllegalArgumentException("Invalid minute");
        }
    }

    private void validateSecond(int second) {
        boolean secondIsValid = second < 0 || second >= 60;
        if (secondIsValid) {
            throw new IllegalArgumentException("Invalid seconds");
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.second = second;
    }
}
