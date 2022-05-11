package Personal;

public class Ademola {
    private Phone phone;
    private Laptop pc;
    private Bag bag;
    private Shoe shoes;
    private Cloth clothes;

    public Phone getPhone() {
        return phone;
    }

    public Laptop getPc() {
        return pc;
    }

    public Bag getBag() {
        return bag;
    }
    public Shoe getShoes() {
        return shoes;
    }
    public Cloth getClothes() {
        return clothes;
    }
    public Ademola(Phone phone, Laptop pc, Bag bag, Shoe shoes, Cloth clothes) {
        this.phone = phone;
        this.pc = pc;
        this.bag = bag;
        this.shoes = shoes;
        this.clothes = clothes;
    }
}
