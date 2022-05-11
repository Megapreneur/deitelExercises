package AssignmentTest;

import Assignments.Entry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {
    @Test
    public void getTitle() {
        Entry entry = new Entry("Kam", "5, May, 2022", "Attain  desires");
        assertEquals("Kam", entry.getTitle());
    }
    @Test
    public void getDate() {
        Entry entry = new Entry("sutra", "5, May, 2022", "Attain desires");
        assertEquals("5, May, 2022", entry.getDate());
    }
    @Test
    public void getBody() {
        Entry entry = new Entry("Kama", "5, May, 2022", "Attain desires");
        assertEquals("Attain sexual desires", entry.getBody());
    }
}