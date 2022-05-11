package Personal;

public class Cloth {
    private int size;
    private String design;
    private String colour;
    private String type;
    private int length;

    public Cloth(int size, String design, String colour, String type, int length) {
        this.size = size;
        this.design = design;
        this.colour = colour;
        this.type = type;
        this.length = length;
    }

    public int getSize() {
        return size;
    }

    public String getDesign() {
        return design;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public int getLength() {
        return length;
    }
}
