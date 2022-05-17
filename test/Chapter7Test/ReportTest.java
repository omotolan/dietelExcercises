package Chapter7Test;

import Chapter7.Report;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ReportTest {
    private Report report;

    @BeforeEach
    public void startWith() {
        int[][] grades = {{20, 70, 50}, {30, 34, 67}};
        report = new Report(grades);
    }

    @Test
    public void reportCanBeCreatedTest() {
        assertNotNull(report);
    }

    @Test
    public void totalSumTest() {
        int[][] grades = {{20, 70, 80}, {20, 34, 67}};
        report.setGrades(grades);
        int result = report.totalSum();
        assertEquals(291, result);

    }

    @Test
    public void gradeSumOfEachStudentTest() {
//        int [][] grades = {{20, 60, 50},{20, 34, 67}};
//        report.setGrades(grades);
        int result = report.gradeSumOfEachStudent(0);
        assertEquals(140, result);
    }

    @Test
    public void averageOfEachStudentTest() {
        //report.gradeSumOfEachStudent(0);
        double result = report.averageOfEachStudent(0);
        assertEquals(46.666666666666664, result);
    }

    @Test
    public void highestScoreInEachSubjectTest() {
        int[][] grades = {{54, 60, 50}, {7, 74, 67}};
        report.setGrades(grades);
        int result = report.highestScoreInEachSubject(1);
        assertEquals(74, result);
    }

    @Test
    public void totalGradeInEachSubjectTest() {
        int[][] grades = {{54, 60, 50}, {7, 74, 67}, {78, 60}};
        report.setGrades(grades);
        int result = report.totalGradeForEachSubject(1);
        assertEquals(194, result);

    }
    @Test
    public void hardestSubjectTest(){
        int[][] grades = {{74, 60, 50, 7}, {77, 74, 97, 23}, {76, 60, 20, 15}};
        report.setGrades(grades);
        int result = report.hardestSubject();
        assertEquals(1, result);

    }
}
