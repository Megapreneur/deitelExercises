package PersonalTest2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneTest {

    @Test
    public void testForScreen() {
        Screen screen = new Screen(20, "hd", "touch");
        Phone phone = new Phone(screen, 15, "blue", "good");
        assertEquals(20, phone.getScreen().getSize());
        assertEquals("hd", phone.getScreen().getResolution());
        assertEquals("touch", phone.getScreen().getType());

    }
    @Test
    public void testSize() {
        Screen screen = new Screen(20, "hd", "touch");
        Phone phone = new Phone(screen, 15, "blue", "good");
        assertEquals(15, phone.getSize());
    }
    @Test
    void getColour() {
        Screen screen = new Screen(20, "hd", "touch");
        Phone phone = new Phone(screen, 15, "blue", "good");
        assertEquals("blue", phone.getColour());
    }

    @Test
    void getCamera() {
        Screen screen = new Screen(20, "hd", "touch");
        Phone phone = new Phone(screen, 15, "blue", "good");
        assertEquals("good", phone.getCamera());
    }
}