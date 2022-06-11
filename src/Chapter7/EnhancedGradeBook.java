package Chapter7;

public class EnhancedGradeBook {

    private int[][] gradeBook;
    private int numberOfStudents;
    private int numberOfSubjects;

    public EnhancedGradeBook() {
        gradeBook = new int[numberOfStudents][numberOfSubjects];
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getNumberOfSubjects() {
        return numberOfSubjects;
    }

    public void setNumberOfSubjects(int numberOfSubjects) {
        this.numberOfSubjects = numberOfSubjects;
    }

    public void displayGradeBook(){
        for (int student = 0; student < gradeBook.length; student++) {
            for (int subject = 0; subject < gradeBook[student].length; subject++) {
                System.out.println(gradeBook[student][subject] + " ");
            }
        }
    }
    public void enterSubjectScore(int studentNumber, int subjectScore){
            gradeBook[0][0] = subjectScore;
    }
}
