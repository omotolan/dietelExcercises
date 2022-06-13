package Chapter7;


public class EnhancedGradeBook {


    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public int getNumberOfSubjects() {
        return numberOfSubjects;
    }

    public int[][] getGradeBook() {
        return gradeBook;
    }

    private int numberOfStudents;
    private int numberOfSubjects;
    private  int[][] gradeBook;




//    public EnhancedGradeBook(int[][] gradeBook) {
//       this.gradeBook= gradeBook;
//    }


    public void setNumberOfStudents(int numberOfStudents){
        this.numberOfStudents = numberOfStudents;
        System.out.println("num of stud " + this.numberOfStudents);
    }
    public void setNumberOfSubjects(int numberOfSubjects) {
        this.numberOfSubjects = numberOfSubjects;
        System.out.println("num of sub " + this.numberOfSubjects);
    }

    public void displayGradeBook(){
        System.out.println(gradeBook.length);
        for (int student = 0; student < getNumberOfStudents(); student++) {
            System.out.println("something");
            for (int subject = 0; subject < getNumberOfSubjects(); subject++) {
                System.out.print(gradeBook[student][subject] + " ");
            }
            System.out.println();
        }
    }

    public int highestScoreInASubject(int subject){
        int highestScore = gradeBook[0][0];
        for (int i = 0; i < gradeBook.length; i++) {
                if (gradeBook[i][subject] > highestScore){
                    highestScore = gradeBook[i][subject];
                }
        }
return highestScore;
    }

    public int lowestScoreInASubject(int subject){
        int lowest = gradeBook[0][0];
        for (int i = 0; i < gradeBook.length; i++) {
            if (lowest < gradeBook[i][subject] ){
                lowest = gradeBook[i][subject];
            }

        }
        return lowest;
    }
    public int totalScore(){
        int total = 0;
        for (int i = 0; i < gradeBook.length; i++) {
            for (int j = 0; j < gradeBook[i].length; j++) {
                total += gradeBook[i][j];
            }

        }
        return total;
    }


}
