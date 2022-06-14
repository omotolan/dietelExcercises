package Chapter8;

public class TimeSecond {
    private int hour;
    private int minute;
    private int second;
    private int tickSecond;

    public TimeSecond(int second){
        validateSecond(second);
        this.second = second;
        this.hour = 0;
        this.minute = 0;
    }
    private void validateSecond(int second){
        boolean isSecondValid = second >= 0 && second < 60;
        if (!isSecondValid){
            throw new  IllegalArgumentException("Second can not be less that 0 or greater than 59.");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.second = second;
    }
    private void setMinute(){

    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }
    public void tick(){
       // int tickSecond = 0;
        tickSecond++;
        second = tickSecond - 1;

        if (tickSecond == 60){

            tickSecond = 0;
            if (second == 59) {
                minute++;
                if (minute == 59){
                    hour++;
                    minute = 0;
                }
            }
        }



    }
    private void determineMinute(){
        if (minute == 59){
            hour++;
            minute = 0;
        }

    }
}
