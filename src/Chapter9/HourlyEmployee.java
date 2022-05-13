package Chapter9;

public class HourlyEmployee extends Employeee{
    private double hours;
    private double hourlyWage;
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double hourlyWage) {
        super(firstName, lastName, socialSecurityNumber);
        this.hours = hours;
        this.hourlyWage = hourlyWage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0 || hours > 168){
            throw new IllegalArgumentException("hour should be >0 and <= 168");
        }
        this.hours = hours;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        if (hourlyWage < 0){
            throw new IllegalArgumentException("hourly wage should be >0 ");
        }
        this.hourlyWage = hourlyWage;
    }
    public double getEarnings(){
        return getHourlyWage() * getHours();
    }
    @Override
    public  String toString(){
        return String.format("%s%s%n %s%s%n %s%s%n %s%.2f%n %s%.2f%n %s%.2f%n", "first name: ", getFirstName(), "last name: ", getLastName(),
                "social security number: ", getSocialSecurityNumber(), "hours worked: ", getHours(), "hourly wage: ",
                getHourlyWage(), "total earnings: ", getEarnings());
    }
}
