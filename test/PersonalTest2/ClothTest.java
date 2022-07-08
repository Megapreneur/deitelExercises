package PersonalTest2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClothTest {

    @Test
    public void getSize() {
        Cloth cloth = new Cloth(20, "vintage", "multicolour", "silk", 15);
        assertEquals(20, cloth.getSize());
    }

    @Test
    public void getDesign() {
        Cloth cloth = new Cloth(20, "vintage", "multicolour", "silk", 15);
        assertEquals("vintage", cloth.getDesign());
    }

    @Test
    public void getColour() {
        Cloth cloth = new Cloth(20, "vintage", "green", "silk", 15);
        assertEquals("green", cloth.getColour());
    }

    @Test
    public void getType() {
        Cloth cloth = new Cloth(20, "vintage", "multicolour", "silk", 15);
        assertEquals("silk", cloth.getType());
    }

    @Test
    public void getLength() {
        Cloth cloth = new Cloth(20, "vintage", "multicolour", "silk", 15);
        assertEquals(15, cloth.getLength());
    }
}