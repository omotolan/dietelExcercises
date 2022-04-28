package Chapter9;

public class PartTimeEmployee extends Employee {
    private double annualSalary;

    public PartTimeEmployee(String employeeNumber, String employeeName, double hourlyPay) {
        super(employeeNumber, employeeName);
        this.annualSalary = hourlyPay;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double calculateWeeklyPay(int numberOfHours) {

        return numberOfHours * annualSalary;
    }

    public double calculateWeeklyPay() {
        return (int) annualSalary / 12;
    }
}
