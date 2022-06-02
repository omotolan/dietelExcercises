package Chapter4;

public class TaxCalculator {
    private double earnings;

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        if (earnings > 0) {
            this.earnings = earnings;
        }
    }

    public double getTaxRate() {
        double taxRate = 0.0;
        if (earnings <= 30000) {
            taxRate = (earnings * 15) / 100;
        } else if (earnings > 30000) {
            taxRate = (earnings * 20) / 100;
        }
        return taxRate;
    }

}
