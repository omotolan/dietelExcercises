package tddClass;


public class AutomaticCar {
    private boolean powerOn;
    private boolean powerOff;
    public void powerOnCar(boolean on){
        on = true;
        powerOn = on;
    }
    public boolean getCarToPowerOn(){
        return powerOn;
    }
    public void powerOffCar(boolean off){
        off = false;
        powerOff = off;
    }
    public boolean getCarToPowerOff(){
        return powerOff;
    }

}
