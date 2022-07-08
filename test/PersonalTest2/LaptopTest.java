package PersonalTest2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LaptopTest {

    @Test
    public void getModel() {
        KeyBoard keyBoard = new KeyBoard(true, true, 13);
        MotherBoard brainBox = new MotherBoard("brain", 512);
        Laptop laptop = new Laptop("Dell", "touch", 15.4, keyBoard, brainBox);
        assertEquals("Dell", laptop.getModel());
    }

    @Test
    public void getScreenType() {
        KeyBoard keyBoard = new KeyBoard(true, true, 13);
        MotherBoard brainBox = new MotherBoard("brain", 512);
        Laptop laptop = new Laptop("Dell", "touch", 15.4, keyBoard, brainBox);
        assertEquals("touch", laptop.getScreenType());
    }

    @Test
    public void getScreenSize() {
        KeyBoard keyBoard = new KeyBoard(true, true, 13);
        MotherBoard brainBox = new MotherBoard("brain", 512);
        Laptop laptop = new Laptop("Dell", "touch", 15.4, keyBoard, brainBox);
        assertEquals(15.4, laptop.getScreenSize());
    }

    @Test
    public void getKeyboard() {
        KeyBoard keyBoard = new KeyBoard(true, true, 13);
        MotherBoard brainBox = new MotherBoard("brain", 512);
        Laptop laptop = new Laptop("Dell", "touch", 15.4, keyBoard, brainBox);
        assertTrue(keyBoard.isKeyBoardLight("on"));
        assertTrue(keyBoard.isFingerPrint());
        assertEquals(13, keyBoard.getSize());
    }

    @Test
    public void getMotherBoard() {
        KeyBoard keyBoard = new KeyBoard(true, true, 13);
        MotherBoard brainBox = new MotherBoard("brain", 512);
        Laptop laptop = new Laptop("Dell", "touch", 15.4, keyBoard, brainBox);
        assertEquals("brain", brainBox.getChips());
        assertEquals(512, brainBox.getMemory());
    }
}