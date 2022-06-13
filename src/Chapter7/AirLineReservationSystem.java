package Chapter7;

public class AirLineReservationSystem {
    private final boolean[] seats = new boolean[10];
    private int firstClass;
    private int economy;
    private boolean isFull;

    public AirLineReservationSystem() {
        firstClass = 0;
        economy = 5;
    }

    public boolean isFull() {
        if (firstClass == 5 && economy == 10) {
            isFull = true;
        }
        return isFull;
    }

    public int getFirstClassSeats() {
        return firstClass;
    }

    public int getEconomySeats() {
        return economy;
    }


    public void setFirstClass() {
        if (firstClass != 5) {
            seats[firstClass] = true;
            firstClass++;
        }
    }

    public void setEconomy() {
        if (economy != 10) {
            seats[economy] = true;
            economy++;
        }
    }

}
