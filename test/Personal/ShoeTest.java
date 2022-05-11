package Personal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoeTest {

    @Test
    public void getSize() {
        Shoe shoe = new Shoe(43,"Black", "Nike", "canvas", "slick" );
        assertEquals(43, shoe.getSize());
    }

    @Test
    public void getColour() {
        Shoe shoe = new Shoe(43,"Black", "Nike", "canvas", "slick" );
        assertEquals("Black", shoe.getColour());
    }

    @Test
    public void getModel() {
        Shoe shoe = new Shoe(43,"Black", "Nike", "canvas", "slick" );
        assertEquals("Nike", shoe.getModel());
    }

    @Test
    public void getType() {
        Shoe shoe = new Shoe(43,"Black", "Nike", "canvas", "slick" );
        assertEquals("canvas", shoe.getType());
    }

    @Test
    public void getDesign() {
        Shoe shoe = new Shoe(43,"Black", "Nike", "canvas", "slick" );
        assertEquals("slick", shoe.getDesign());
    }
}