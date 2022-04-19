package Chapter8;

public class Time {
    private int hour;
    private int minute;
    private int second;

        public void setTime(int hour, int minute, int second){
            //validate hour
         if (hour <0 || hour>= 24){ throw new IllegalArgumentException("Invalid hour");}
         // validate minute
         if (minute < 0 || minute >= 60){ throw new IllegalArgumentException("Invalid minute");}
         // validate second
         if(second < 0 || second >= 60) {throw new IllegalArgumentException("Invalid seconds");}
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        }
}
