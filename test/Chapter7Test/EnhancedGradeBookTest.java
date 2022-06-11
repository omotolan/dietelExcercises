package Chapter7Test;

import Chapter7.EnhancedGradeBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EnhancedGradeBookTest {
    private EnhancedGradeBook enhancedGradeBook;

    @BeforeEach
    public void startWith() {
      //  enhancedGradeBook = new EnhancedGradeBook();
    }

    @Test
    public void enhancedGradeBookCanBeCreatedTest() {
        assertNotNull(enhancedGradeBook);

    }

    @Test
    public void setNumberOfStudentsTest() {
      //  enhancedGradeBook.setNumberOfStudents(4);
      //  assertEquals(4, enhancedGradeBook.getNumberOfStudents());
    }

    @Test
    public void setNumberOfSubjectsTest() {
       // enhancedGradeBook.setNumberOfSubjects(4);
       // assertEquals(4, enhancedGradeBook.getNumberOfSubjects());
    }
}
