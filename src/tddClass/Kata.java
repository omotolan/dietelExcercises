package tddClass;

public class Kata {

    private boolean isOn;
    private int volume;
    private boolean mute;
    private String name;
    //private boolean isMute;


    public boolean palindrome(int theNumber) {
        int new1 = (theNumber % 10) / 1;
        int new2 = (theNumber % 100) / 10;
        int new3 = (theNumber % 1000) / 100;
        int new4 = (theNumber % 10000) / 1000;
        int new5 = (theNumber % 100000) / 10000;

        if (new1 == new5) if (new2 == new4) {
            return true;
        }
        if (new1 != new5) if (new2 != new4) {
            return false;
        }
        return false;
    }

    public void tvSwitch() {
      /*  if (isOn == false) {
            isOn = true;
        }
        else {
            isOn = false;
        }*/
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }


    public void tvName(String name) {
        if (isOn) {
            name = "panasonic";
            this.name = name;
        }
    }

    public String getTVName() {
        return name;
    }

    public void volumeIncrease() {
        if (isOn) {
            if (volume >= 0 && volume <= 100) {
                volume++; //= 1;
            }
        }
    }

    public void volumeDecrease() {
        if (isOn) {
            if (volume > 1 && volume <= 100) {
                volume -= 1;
            }
        }
    }

    public int changingVolume() {
        if (mute == true) return volume = 0;
        return volume;

    }

    public void checkMute() {
        mute = !mute;
      /*  if (mute == false) {
            mute = true;
        }
        else {
            mute = false;
        }*/

    }

    public int testDriller(int copy) {
        if (copy >= 1 && copy <= 4) {
            copy = copy * 2000;
        } else if (copy >= 5 && copy <= 9) {
            copy = copy * 1800;
        } else if (copy >= 10 && copy <= 29) {
            copy = copy * 1600;
        } else if (copy >= 30 && copy <= 49) {
            copy = copy * 1500;
        } else if (copy >= 50 && copy <= 99) {
            copy = copy * 1300;
        } else if (copy >= 100 && copy <= 199) {
            copy = copy * 1200;
        } else if (copy >= 200 && copy <= 499) {
            copy = copy * 1100;
        } else {
            copy = copy * 1000;
        }
        return copy;
    }

    public int quotient(int firstNumber, int secondNumber) {
        int number;
        if (firstNumber > secondNumber) {
            number = firstNumber / secondNumber;
            // return number;
        }
        // if (secondNumber > firstNumber) {
        else {
            number = secondNumber / firstNumber;
            //  return number;
        }

        return number;
        /*how i did mine
         *public int quotient(int number){
         * int number1 = 9;
         * int number2 = 3;
         * number = number1/number2
         * return number;
         *
         *
         * */


    }

    public boolean enterInteger(int digit) {
        boolean evenOrOdd = false;
        if (digit % 2 == 0) {
            evenOrOdd = true;
        }
        if (digit % 2 == 1) {
            evenOrOdd = false;

        }
        return evenOrOdd;
    }
}




