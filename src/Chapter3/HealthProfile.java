package Chapter3;

import java.util.Date;

public class HealthProfile {
    // instance variables
    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int year;
    private int age;
    private String dateOfBirth;
    private int maxHeartRate;
    private int targetHeartRate;
    private String gender;
    private double weightInPounds;
    private double heightInInches;
    private double bodyMaxIndex;
    private String fullName;

    java.util.Date currentYear = new Date();



    // constructor
    public HealthProfile(String firstName, String lastName, int day, int month,
                         int year, String gender, double weightInPounds, double heightInInches) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.gender = gender;
        this.weightInPounds = weightInPounds;
        this.heightInInches = heightInInches;
    }

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

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYears() {
        return year;
    }

    public void setYears(int year) {
        this.year = year;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public double getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(double heightInInches) {
        this.heightInInches = heightInInches;
    }

    public int getAge(int year){
        int thisYear = currentYear.getYear();
        //added 1900 to get the current year
        age = thisYear + 1900 - year;
        return age;
    }

    public String birthDetails(){
        dateOfBirth = month + "/" + day + "/" + year;
        return dateOfBirth;
    }

    public int maximumHeartRate(){
        maxHeartRate = 220 - age;
        return maxHeartRate;
    }
    public int getTargetHeartRate(){
        targetHeartRate = (maxHeartRate * 100) / 220;
        return targetHeartRate;
    }
    public double getBodyMaxIndex(){
        double weightInKg = weightInPounds / 2.205;
        double heightInMeters = heightInInches / 39.37;
        bodyMaxIndex = weightInKg / heightInMeters;
        return bodyMaxIndex;
    }

    public String getFullName(){
        fullName = firstName + lastName;
        return fullName;
    }

}
