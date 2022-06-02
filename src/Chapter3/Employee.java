package Chapter3;

public class Employee {
    // instance variables
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    // creating methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public double getYearlySalary(double monthlySalary) {
        this.monthlySalary = 12 * monthlySalary;
        if (monthlySalary == 0.0) {
            return 0.0;
        }
        return this.monthlySalary;
    }

    public double percentageRaise(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary * (10.0 / 100);
        }
        return this.monthlySalary + monthlySalary;
    }
}
