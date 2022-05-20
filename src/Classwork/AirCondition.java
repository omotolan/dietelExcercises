package Classwork;

public class AirCondition {
    private boolean power;
    private boolean power1;
    private int increasing;
    private int decreasing;

    public void powerOn(boolean on) {
        on = true;
        power = on;
    }

    public boolean getOn() {
        return power;
    }

    public void powerOff(boolean off) {
        off = false;
        power1 = off;
    }

    public boolean getOff() {
        return power1;
    }

    public void increaseTemperature(int increase) {
        if (increase >= 16) increasing = increase + 1; if (increase <= 30) increasing= increase + 1;
        if (increase > 30) increasing = 30; if (increase < 16) increasing = 16;

    }


    public int getIncrease() {
        return increasing;
    }

    public void decreaseTenperature(int decrease) {
        if (decrease >= 30) decreasing = decrease - 1; if (decrease >= 16) decreasing= decrease - 1;
        if (decrease > 30) decreasing = 30; if (decrease < 16 ) decreasing = 16;
    }

    public int getDecrease() {
        return decreasing;
    }
}
