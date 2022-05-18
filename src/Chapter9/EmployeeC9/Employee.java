package Chapter9.EmployeeC9;

public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private CommissionModel commissionModel;

    public Employee(String firstName, String lastName, String socialSecurityNumber, CommissionModel commissionModel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.commissionModel = commissionModel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String toString() {
        return String.format("%s%s%n %s%s%n %s%s%n", "first name: ", getFirstName(), "last name: ", getLastName(),
                "social security number", getSocialSecurityNumber());
    }
}
