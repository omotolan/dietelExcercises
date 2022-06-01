package Chapter2;

public class GreatPyramidOfGiza {
    public static void main(String[] args) {
        int numberOFYears = 20;
        double averageWeightOfStones = 2.5;
        int estimatedNumberOfStones = 2_300_000;

        double weightBuiltPerYear = averageWeightOfStones * estimatedNumberOfStones;
        System.out.println(weightBuiltPerYear);
        double weightBuiltPerHour;
        int numberOfDaysToBuild = numberOFYears * 365;
         weightBuiltPerHour = (numberOfDaysToBuild * 24) / weightBuiltPerYear;
        System.out.println(weightBuiltPerHour);
       // double numberOfMinutesToBuild =
    }
}
