package Personal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {

    @Test
    public void getSize() {
        Bag gucci = new Bag(25, "blue", "backPack", "coral", "gucci");
        assertEquals(25, gucci.getSize());
    }

    @Test
    public void getColour() {
        Bag gucci = new Bag(25, "blue", "backPack", "coral", "gucci");
        assertEquals("blue", gucci.getColour());
    }

    @Test
    public void getType() {
        Bag gucci = new Bag(25, "blue", "backPack", "coral", "gucci");
        assertEquals("backPack", gucci.getType());
    }

    @Test
    public void getDesign() {
        Bag gucci = new Bag(25, "blue", "backPack", "coral", "gucci");
        assertEquals("coral", gucci.getDesign());
    }

    @Test
    public void getModel() {
        Bag gucci = new Bag(25, "blue", "backPack", "coral", "gucci");
        assertEquals("gucci", gucci.getModel());
    }
}