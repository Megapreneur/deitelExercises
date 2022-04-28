package ChapterThreeTest;

import ChapterThree.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class CarTest {
    Car car;
    @BeforeEach
    public void beginWith(){
        car = new Car("Benz",2022, 15000.50);
    }
    @Test
    public void isCarNullTest(){
        assertNotNull(car);
    }
    @Test
    public void isCarModel(){
        car.setModel("Benz");
        assertEquals("Benz", car.getModel());
    }
    @Test
    public void isCarYear(){
        car.setModel("Benz");
        car.setYear(2022);
        assertEquals("Benz", car.getModel());
        assertEquals(2022,car.getYear());
    }
    @Test
    public void isCarAmount(){
        car.setModel("Benz");
        car.setYear(2022);
        car.setAmount(15000.40);
        assertEquals("Benz", car.getModel());
        assertEquals(2022, car.getYear());
        assertEquals(15000.40, car.getAmount());
    }
    @Test
    public void discountOfCarTest(){
        car.setModel("Benz");
        car.setYear(2022);
        car.setAmount(15000.40);
        car.setDiscount(5);
        assertEquals("Benz", car.getModel());
        assertEquals(2022, car.getYear());
        assertEquals(15000.40, car.getAmount());
        assertEquals(5, car.getDiscount());
    }
    @Test
    public void purchasingTwoCarsTest(){
        Car car2 = new Car("Toyota", 2022, 15000.40);
        car.setModel("Benz");
        car2.setModel("Toyota");
        car.setYear(2022);
        car2.setYear(2022);
        car.setAmount(10000.50);
        car2.setAmount(15000.50);
        car.setDiscount(5);
        car2.setDiscount(7);
        assertEquals("Benz", car.getModel());
        assertEquals("Toyota", car2.getModel());
        assertEquals(2022, car.getYear());
        assertEquals(2022, car2.getYear());
        assertEquals(0.05, car.getDiscount());
        assertEquals(0.07, car2.getDiscount());
        assertEquals(14989.99965, car2.getAmount());
        assertEquals(9995.49975, car.getAmount());
    }

}

