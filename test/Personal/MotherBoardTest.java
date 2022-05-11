package Personal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotherBoardTest {

    @Test
    public void getChips() {
        MotherBoard brainBox = new MotherBoard("brain", 512);
        assertEquals("brain", brainBox.getChips());
    }

    @Test
    public void getMemory() {
        MotherBoard brainBox = new MotherBoard("brain", 512);
        assertEquals(512, brainBox.getMemory());
    }
}