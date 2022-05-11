package Personal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeyBoardTest {

    @Test
    public void isKeyBoardLight() {
        KeyBoard keyBoard = new KeyBoard(false, false, 30);
        keyBoard.isKeyBoardLight("off");
        assertFalse(keyBoard.isKeyBoardLight("off"));
    }

    @Test
    public void isFingerPrint() {
        KeyBoard keyBoard = new KeyBoard(false, false, 30);
        keyBoard.fingerPrint();
        assertTrue(keyBoard.isFingerPrint());
    }

    @Test
    public void getSize() {
        KeyBoard keyBoard = new KeyBoard(false, false, 30);
        assertEquals(30, keyBoard.getSize());
    }
}