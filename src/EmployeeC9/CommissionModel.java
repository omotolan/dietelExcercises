package EmployeeC9;

public class CommissionModel {
    private double grossSales;
    private double commissionRate;

    public CommissionModel(double grossSales, double commissionRate) {
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }
    public double getEarnings(){
        return getCommissionRate() * getGrossSales();
    }
}
