import Chapter7.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DiaryTest {

    private Diary mine;

    @BeforeEach
    public void startWith() {
        mine = new Diary("tola", "gsua");
    }

    @Test
    public void diaryCanBeCreatedTest() {
        assertNotNull(mine);
    }

    @Test
    public void diaryCanBeLockedTest() {
        mine.lock();
        assertTrue(mine.isLock());
    }

    @Test
    public void diaryCanBeUnlockedTest() {
        mine.lock();
        assertTrue(mine.isLock());
        mine.unLock("gsua");
        assertFalse(mine.isLock());
    }

    @Test
    public void addEntryTest() {
        mine.createEntry("my love", "i love love");
        mine.createEntry("my egg", "i love love");
        mine.createEntry("my loveth", "i love love");
        mine.createEntry("my cow", "i love love");
        mine.createEntry("my goat", "i love love");
        int size = mine.getNoOfEntry();
        assertEquals(5, size);
    }

    @Test
    public void getNumberOfEntryTest() {
        mine.createEntry("my love", "i love love");
        mine.createEntry("my egg", "i love love");
        mine.createEntry("my loveth", "i love love");
        int size = mine.getNoOfEntry();
        assertEquals(3, size);
    }

    @Test
    public void findEntryTest() {
        mine.createEntry("my love", "i love love");
        mine.createEntry("my egg", "i love love");
        mine.createEntry("my loveth", "i love love");
        mine.createEntry("my cow", "i love love");
        int size = mine.getNoOfEntry();
        assertEquals(4, size);
        int enter = mine.findEntry("my cow");
        assertEquals(4, enter);
    }

    @Test
    public void deleteEntryTest() {
        mine.createEntry("my love", "i love love");
        mine.createEntry("my egg", "i love love");
        mine.createEntry("my loveth", "i love love");
        mine.createEntry("my cow", "i love love");
        mine.createEntry("my goat", "i love love");
        int size = mine.getNoOfEntry();
        assertEquals(5, size);
        mine.deleteEntry("my loveth");
        int sizes = mine.getNoOfEntry();
        assertEquals(4, sizes);
    }

    @Test
    public void passwordCanBeChangedTest() {
        mine.updatePassword("gsua", "tolani");
        assertTrue(mine.validatePassword("tolani"));
    }


}
