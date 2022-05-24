package AssignmentTest;

import Assignments.Diary;
import Assignments.Entry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    @Test
    public void createDiary(){
        Diary myDiary = new Diary("nutmeg", "@2345%");
        assertNotNull(myDiary);
    }
    @Test
    public void entryCanBeCreated(){
        Diary myDiary = new Diary("nutmeg", "@2345");
        myDiary.createEntry("keffi", "5, May, 2022", "reaching the stars");
        assertEquals(1, myDiary.getNumberOfEntry());
    }
    @Test
    public void findEntryByTitleTest(){
        Diary myDiary = new Diary("nutmeg", "@2345");
        myDiary.createEntry("kakag", "5, May, 2022", "moon");
        myDiary.createEntry("Java", "5, May, 2022", "ocean");
        myDiary.createEntry("Python", "5, May, 2022", "mars");
        myDiary.createEntry("Database", "5, May, 2022", "venus");
        myDiary.createEntry("Industrial design", "5, May, 2022", "pluto");
        assertEquals(5, myDiary.getNumberOfEntry());
        int vary = myDiary.findEntryByTitle("Java");
        assertEquals(2, vary);
    }
    @Test
    public void findEntryByDateTest(){
        Diary myDiary = new Diary("nutmeg", "@2345");
        myDiary.createEntry("kontra", "5, May, 2022", "ocean");
        myDiary.createEntry("Java", "6, May, 2022", "enter");
        myDiary.createEntry("Python", "7, May, 2022", "climate");
        myDiary.createEntry("Database", "8, May, 2022", "climate change");
        myDiary.createEntry("Industrial design", "9, May, 2022", "clown");
        assertEquals(5, myDiary.getNumberOfEntry());
        int when = myDiary.findEntryByDate("7, May, 2022");
        assertEquals(3, when);
    }
    @Test
    public void deleteEntryByTitleTest(){
        Diary myDiary = new Diary("nutmeg", "@2345");
        myDiary.createEntry("kontra", "5, May, 2022", "reaching climax");
        myDiary.createEntry("Java", "5, May, 2022", "reaching climax");
        myDiary.createEntry("Python", "5, May, 2022", "reaching the moon");
        myDiary.createEntry("Database", "5, May, 2022", "i'm good");
        myDiary.createEntry("Industrial design", "5, May, 2022", "reaching climax");
        assertEquals(5, myDiary.getNumberOfEntry());
        myDiary.deleteEntryByTitle("Java");
        assertEquals(4, myDiary.getNumberOfEntry());
        int vary = myDiary.findEntryByTitle("Java");
        assertEquals(-8, vary);
    }
    @Test
    public void deleteEntryByDateTest(){
        Diary myDiary = new Diary("nutmeg", "@2345");
        myDiary.createEntry("kamasutra", "8, May, 2022", "reaching climax");
        myDiary.createEntry("Java", "9, May, 2022", "reaching climax");
        myDiary.createEntry("Python", "5, May, 2022", "reaching climax");
        myDiary.createEntry("Database", "6, May, 2022", "reaching climax");
        myDiary.createEntry("Industrial design", "4, May, 2022", "reaching climax");
        assertEquals(5, myDiary.getNumberOfEntry());
        myDiary.deleteEntryByDate("4, May, 2022");
        assertEquals(4, myDiary.getNumberOfEntry());
        int when = myDiary.findEntryByDate("4, May, 2022");
        assertEquals(-8, when);
    }
    @Test
    public void lockAndUnlockTest(){
        Diary myDiary = new Diary("nutmeg", "@2365");
        myDiary.createEntry("kamasutra", "8, May, 2022", "reaching climax");
        myDiary.createEntry("Java", "9, May, 2022", "reaching climax");
        myDiary.createEntry("Python", "5, May, 2022", "reaching climax");
        myDiary.createEntry("Database", "6, May, 2022", "reaching climax");
        myDiary.createEntry("Industrial design", "4, May, 2022", "reaching climax");
        assertEquals(5, myDiary.getNumberOfEntry());
        myDiary.deleteEntryByDate("4, May, 2022");
        assertEquals(4, myDiary.getNumberOfEntry());
        int when = myDiary.findEntryByDate("4, May, 2022");
        assertEquals(-8, when);
    }
    @Test
    public void deleteAllEntryTest(){
        Diary myDiary = new Diary("nutmeg", "@2365");
        myDiary.createEntry("kamasutra", "8, May, 2022", "reaching climax");
        myDiary.createEntry("Java", "9, May, 2022", "reaching climax");
        myDiary.createEntry("Python", "5, May, 2022", "reaching climax");
        myDiary.createEntry("Database", "6, May, 2022", "reaching climax");
        myDiary.createEntry("Industrial design", "4, May, 2022", "reaching climax");
        assertEquals(5, myDiary.getNumberOfEntry());
        myDiary.deleteAllEntry("@2365");
        assertEquals(0, myDiary.getNumberOfEntry());
    }

}