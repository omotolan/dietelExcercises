package Chapter9;

public class Employeee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employeee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
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
