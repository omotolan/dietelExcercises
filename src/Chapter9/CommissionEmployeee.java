package Chapter9;

public class CommissionEmployeee extends Employeee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployeee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("%s%s%n %s%s%n %s%s%n %s%.2f%n %s%.2f%n %s%.2f%n", "first name: ", getFirstName(), "last name: ", getLastName(),
                "social security number: ", getSocialSecurityNumber(), "gross sales: ", getGrossSales(), "commission rate: ",
                getCommissionRate(), "total earnings: ", earnings());
    }
}
