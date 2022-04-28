package Chapter9;

public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String employeeNumber, String employeeName, double monthlySalary) {
        super(employeeNumber, employeeName);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
