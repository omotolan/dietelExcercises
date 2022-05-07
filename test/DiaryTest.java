import Chapter7.Diary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class DiaryTest {
    @Test
    public void diaryCanBeCreatedTest() {
        Diary mine = new Diary("tola", "1234");
        assertNotNull(mine);
    }

    @Test
    public void addEntryTest() {
        Diary mine = new Diary("tola", "1234");
        mine.createEntry("my love", "may 5", "i love love");
        mine.createEntry("my egg", "may 5", "i love love");
        mine.createEntry("my loveth", "may 5", "i love love");
        mine.createEntry("my cow", "may 5", "i love love");
        mine.createEntry("my goat", "may 5", "i love love");
        int size = mine.getNoOfEntry();
        assertEquals(5, size);
    }

    @Test
    public void getNumberOfEntryTest() {
        Diary mine = new Diary("tola", "1234");
        mine.createEntry("my love", "may 5", "i love love");
        mine.createEntry("my egg", "may 5", "i love love");
        mine.createEntry("my loveth", "may 5", "i love love");
        int size = mine.getNoOfEntry();
        assertEquals(3, size);

    }

    @Test
    public void findEntryTest() {
        Diary mine = new Diary("tola", "1234");
        mine.createEntry("my love", "may 5", "i love love");
        mine.createEntry("my egg", "may 5", "i love love");
        mine.createEntry("my loveth", "may 5", "i love love");
        mine.createEntry("my cow", "may 5", "i love love");
        int size = mine.getNoOfEntry();
        assertEquals(4, size);
        int enter = mine.findEntry("my cow");
        assertEquals(4, enter);

    }

    @Test
    public void deleteEntryTest() {
        Diary mine = new Diary("tola", "1234");
        mine.createEntry("my love", "may 5", "i love love");
        mine.createEntry("my egg", "may 5", "i love love");
        mine.createEntry("my loveth", "may 5", "i love love");
        mine.createEntry("my cow", "may 5", "i love love");
        mine.createEntry("my goat", "may 5", "i love love");
        int size = mine.getNoOfEntry();
        assertEquals(5, size);
        mine.deleteEntry("my loveth");
        int sizes = mine.getNoOfEntry();
        assertEquals(4, sizes);

    }


}
