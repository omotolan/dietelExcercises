package Classwork;

public class AutomaticBike {
    private boolean isOn;
    private int speed;

    private String gearNumber;

    public void powerBikeOn(){
        isOn = true;
    }
    public void powerOffBike(){
        isOn = false;
    }
    public boolean isOn() {
        return isOn;
    }

    public void accelerate(int speed){
        if (speed < 20) {
            speed += 1;
        }
        else if( speed > 20 ){
            speed += 2;
        }
        else if(speed >30 ){
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

}

    public int speed() {
        return speed;
    }

    }





