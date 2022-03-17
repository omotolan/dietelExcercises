package tddClass;

public class AutomaticBike {
    private boolean isOn;
    private int speed;
    //private int accelerate;

    private String gearNumber;

    /*public void startBike() {
        isOn = true;
    }
    public void stopBike() {
        isOn = false;
    }*/
    public void powerBike(boolean isOn){
        this.isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void accelerate(int speed){
       // this.speed = speed;
        if (speed >=1 && speed <=20) {
            speed = speed + 1;
        }
        else if( speed >= 21 && speed <30){
            speed = speed + 2;
        }
        else if(speed >=31 && speed <40){
            speed = speed +3;
        }
        else {speed = speed +4; }
                 this.speed = speed;
        }
    public void decelerate(int speed) {
        if (speed <21) {
            speed -=1;
        }
        else if(speed < 31){
            speed -=2;
        }
        else if (speed <41){
            speed -=3;
        }
        else { speed-=4;}
        this.speed=speed;



    /*public void gearChangesAutomaticallyToGearType(int gearSpeed) {
        if (gearSpeed >= 0) if (gearSpeed <= 20) {
            gearNumber = "gear one";
        }

        if (gearSpeed >= 21) if (gearSpeed <= 30) {
            gearNumber = "gear two";
        }

        if (gearSpeed >= 31) if (gearSpeed <= 40) {
            gearNumber = "gear three";
        }

        if (gearSpeed >= 41) {
            gearNumber = "gear four";
        }

    }
        public String getTellMeTheGearType () {
            return gearNumber;
        }*/



}

    public int speedChange() {
        return speed;
    }

    }





