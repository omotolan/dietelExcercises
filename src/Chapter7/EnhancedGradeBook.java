package Chapter7;


public class EnhancedGradeBook {


    private int[][] gradeBook;

    public EnhancedGradeBook(int[][] gradeBook) {
       this.gradeBook = gradeBook;
    }



    public void displayGradeBook(){
        for (int student = 0; student < gradeBook.length; student++) {
            System.out.println();
            for (int subject = 0; subject < gradeBook[student].length; subject++) {
                System.out.print(gradeBook[student][subject] + " ");
            }
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
