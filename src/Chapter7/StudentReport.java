package Chapter7;

import java.util.Arrays;

public class StudentReport {
    private int[][] grades;

    public StudentReport(int[][] grades) {
        this.grades = grades;
    }

    public void setGrades(int[][] grades) {
        this.grades = grades;
    }

    public int totalSum() {
        int sum = 0;

        for (int student = 0; student < grades.length; student++) {
            for (int grade = 0; grade < grades[student].length; grade++) {
                sum += grades[student][grade];

            }
        }
        return sum;
    }

    public int gradeSumOfEachStudent(int studentIndex) {
        int total = 0;
        for (int columns = 0; columns < grades[studentIndex].length; columns++) {
            total += grades[studentIndex][columns];

        }
        return total;
    }

    public double averageOfEachStudent(int studentIndex) {
        int sum = gradeSumOfEachStudent(studentIndex);
        int total = 0;
        for (int i = 0; i < grades[studentIndex].length; i++) {
            total++;

        }
        return (double) sum / total;
    }

    public int positionOfStudent(int studentIndex) {
        int sum = gradeSumOfEachStudent(studentIndex);
        Integer[] gradeSum = new Integer[grades.length];
        int total;

        //get the sum of each student and store in an array
        for (int i = 0; i < grades.length; i++) {
            total = 0;
            for (int j = 0; j < grades[i].length; j++) {
                total += grades[i][j];
                gradeSum[i] = total;
            }
        }

        //re-arrange elements of array in descending order
        for (int i = 0; i < gradeSum.length; i++) {
            for (int j = i + 1; j < gradeSum.length; j++) {
                if (gradeSum[i] < gradeSum[j]) {
                    int temp;
                    temp = gradeSum[i];
                    gradeSum[i] = gradeSum[j];
                    gradeSum[j] = temp;
                }
            }
        }

        return Arrays.asList(gradeSum).indexOf(sum) + 1;
    }

    public int highestScoreInEachSubject(int subjectIndex) {
        int highestScore = grades[0][subjectIndex];

        // loop to get the highest score
        for (int i = 1; i < grades.length; i++) {
            if (grades[i][subjectIndex] > highestScore) {
                highestScore = grades[i][subjectIndex];
            }

        }
        return highestScore;
    }

    public int totalGradeForEachSubject(int subjectIndex) {
        int total = 0;
        for (int i = 0; i < grades.length; i++) {
            total += grades[i][subjectIndex];

        }
        return total;
    }

    public double averageScoreForEachSubject(int subjectIndex) {
        int sum = totalGradeForEachSubject(subjectIndex);
        return (double) sum / grades.length;
    }

    public int passesInSubject(int subjectIndex) {
        int passes = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i][subjectIndex] >= 50) {
                passes++;
            }
        }
        return passes;
    }

    public int failsInSubject(int subjectIndex) {
        int fails = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i][subjectIndex] < 50) {
                fails++;
            }
        }
        return fails;
    }

    public int hardestSubject(){
        int[] array = new int[grades.length];
        int hardest = 0;

        for (int student = 0; student <grades.length ; student++) {
            int fails = 0;
            for (int subject = 0; subject < grades[student].length; subject++) {
                if (grades[student][subject] < 50) {
                    fails++;
                    array[subject] = fails;
                }
            }
        }
        hardest = array[0];
        for (int i = 0; i < array.length; i++) {
            hardest = array[i];
        }
        return hardest;
    }
}