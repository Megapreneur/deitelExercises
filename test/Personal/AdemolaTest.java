package Personal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdemolaTest {

    @Test
    public void getPhone() {
        Screen screen = new Screen(14, "hd", "touch");
        Phone phone = new Phone(screen, 10, "gold", "good");
        MotherBoard brainBox = new MotherBoard("brain", 512);
        KeyBoard keyBoard = new KeyBoard(true,false, 16);
        Laptop pc = new Laptop("Dell", "touch", 15.5, keyBoard, brainBox);
        Bag bag = new Bag(16, "grey", "backPack", "leather", "gucci");
        Shoe shoes = new Shoe(43, "black", "prada", "chelsea boot", "plain");
        Cloth clothes = new Cloth(9, "vintage", "multicoloured", "cotton", 10);
        Ademola me = new Ademola(phone, pc, bag, shoes, clothes);
        assertEquals(phone, me.getPhone());
    }
    @Test
    public void getPc() {
        Screen screen = new Screen(14, "hd", "touch");
        Phone phone = new Phone(screen, 10, "gold", "good");
        MotherBoard brainBox = new MotherBoard("brain", 512);
        KeyBoard keyBoard = new KeyBoard(true,false, 16);
        Laptop pc = new Laptop("Dell", "touch", 15.5, keyBoard, brainBox);
        Bag bag = new Bag(16, "grey", "backPack", "leather", "gucci");
        Shoe shoes = new Shoe(43, "black", "prada", "chelsea boot", "plain");
        Cloth clothes = new Cloth(9, "vintage", "multicoloured", "cotton", 10);
        Ademola me = new Ademola(phone, pc, bag, shoes, clothes);
        assertEquals(pc, me.getPc());
    }
    @Test
    public void getBag() {
        Screen screen = new Screen(14, "hd", "touch");
        Phone phone = new Phone(screen, 10, "gold", "good");
        MotherBoard brainBox = new MotherBoard("brain", 512);
        KeyBoard keyBoard = new KeyBoard(true,false, 16);
        Laptop pc = new Laptop("Dell", "touch", 15.5, keyBoard, brainBox);
        Bag bag = new Bag(16, "grey", "backPack", "leather", "gucci");
        Shoe shoes = new Shoe(43, "black", "prada", "chelsea boot", "plain");
        Cloth clothes = new Cloth(9, "vintage", "multicoloured", "cotton", 10);
        Ademola me = new Ademola(phone, pc, bag, shoes, clothes);
        assertEquals(bag, me.getBag());
    }
    @Test
    public void getShoes() {
        Screen screen = new Screen(14, "hd", "touch");
        Phone phone = new Phone(screen, 10, "gold", "good");
        MotherBoard brainBox = new MotherBoard("brain", 512);
        KeyBoard keyBoard = new KeyBoard(true,false, 16);
        Laptop pc = new Laptop("Dell", "touch", 15.5, keyBoard, brainBox);
        Bag bag = new Bag(16, "grey", "backPack", "leather", "gucci");
        Shoe shoes = new Shoe(43, "black", "prada", "chelsea boot", "plain");
        Cloth clothes = new Cloth(9, "vintage", "multicoloured", "cotton", 10);
        Ademola me = new Ademola(phone, pc, bag, shoes, clothes);
        assertEquals(shoes, me.getShoes());
    }

    @Test
    public void getClothes() {
        Screen screen = new Screen(14, "hd", "touch");
        Phone phone = new Phone(screen, 10, "gold", "good");
        MotherBoard brainBox = new MotherBoard("brain", 512);
        KeyBoard keyBoard = new KeyBoard(true,false, 16);
        Laptop pc = new Laptop("Dell", "touch", 15.5, keyBoard, brainBox);
        Bag bag = new Bag(16, "grey", "backPack", "leather", "gucci");
        Shoe shoes = new Shoe(43, "black", "prada", "chelsea boot", "plain");
        Cloth clothes = new Cloth(9, "vintage", "multicoloured", "cotton", 10);
        Ademola me = new Ademola(phone, pc, bag, shoes, clothes);
        assertEquals(clothes, me.getClothes());
    }
}