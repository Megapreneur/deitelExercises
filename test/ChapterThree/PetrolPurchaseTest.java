package ChapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.*;

public class PetrolPurchaseTest {
    PetrolPurchase benz;
    @BeforeEach
    public void beginWith(){
        benz = new PetrolPurchase("", "", 0, 0);
    }
    @Test
    public void carTest(){
        assertNotNull(benz);
    }
    @Test
    public void carLocationTest(){
        benz.setLocation("Lagos");
        assertEquals("Lagos", benz.getLocation());
    }
    @Test
    public void petrolTypeTest(){
        benz.setPetrolType("diesel");
        assertEquals("diesel", benz.getPetrolType());
    }
    @Test
    public void  quantityTest(){
        benz.setPetrolType("petrol");
        benz.setQuantity(400);
        assertEquals(400, benz.getQuantity());
    }
    @Test
    public void purchaseInLitreTest(){
        benz.setPetrolType("petrol");
        benz.setQuantity(40);
        benz. setPrice(5000.50);
        assertEquals("petrol", benz.getPetrolType());
        assertEquals(40, benz.getQuantity());
        assertEquals(5000.50, benz.getPrice());
    }
    @Test
    public void amountPurchaseTest(){
        benz.setPetrolType("petrol");
        benz.setQuantity(40);
        benz.setPrice(10000.30);
        assertEquals("petrol", benz.getPetrolType());
        assertEquals(40, benz.getQuantity());
        assertEquals(10000.30, benz.getPrice());

    }


}