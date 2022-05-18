package Chapter9.EmployeeC9;

public class BasePlusCommissionCompensationModel extends CommissionModel{
    private double baseSalary;
    public BasePlusCommissionCompensationModel(double grossSales, double commissionRate, double baseSalary) {
        super(grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    @Override
    public double getEarnings(){
        return getBaseSalary() + super.getEarnings();
    }
}
