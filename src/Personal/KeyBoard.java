package Personal;

import java.util.Objects;

public class KeyBoard {
    private boolean isKeyBoardLight;
    private boolean isFingerPrint;
    private int size;

    public KeyBoard(boolean isKeyBoardLight, boolean isFingerPrint, int size) {
        this.isKeyBoardLight = isKeyBoardLight;
        this.isFingerPrint = isFingerPrint;
        this.size = size;
    }

    public boolean isKeyBoardLight(String mode) {
        isKeyBoardLight = Objects.equals(mode, "on");
        return isKeyBoardLight;
    }

    public boolean isFingerPrint() {

        return isFingerPrint;
    }

    public int getSize() {
        return size;
    }

    public void fingerPrint() {
        isFingerPrint = !isFingerPrint;
    }
}
