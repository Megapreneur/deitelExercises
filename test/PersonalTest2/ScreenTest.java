package PersonalTest2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScreenTest {

    @Test
    public void getSize() {
        Screen  screen = new Screen(88,"hd","touch");
        assertEquals(88,screen.getSize());
    }
    @Test
    public void getResolution() {
        Screen  screen = new Screen(88,"hd","touch");
        assertEquals("hd",screen.getResolution());

    }
    @Test
    public void getType() {
        Screen  screen = new Screen(88,"hd","touch");
        assertEquals("touch",screen.getType());

    }
}