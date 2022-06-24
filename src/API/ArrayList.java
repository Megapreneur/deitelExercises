package API;

public class ArrayList {
    private  int numberOfElement;
    private int index;

    private int size;
    private int [] elements = new int [size];
    public boolean isEmpty() {
        if(numberOfElement == 0)return true;
        else
            return false;
    }
    public void add(int i, int element) {
        if(numberOfElement < elements.length){
            elements[i] = element;
            size++;
        }
        else {
            elements = new int[elements.length + 1];
            elements[i] = element;
            size++;
        }
    }
    public int get(int i) {
        return elements[i];}

    public int getSize() {
        return size;
    }
    public void set(int i, int element) {
        elements[i] = element;
    }
    public void remove(int i) {
        for (index = 0; index < elements.length; index++) {
            if (index == i){
                elements[index] = elements[index + 1];
            }
            for (int j = index; j < elements.length - 1; j++) {
                elements[j] = elements[j + 1];
            }
        }
        size--;
    }
    public void clear() {
        elements[index] = 0;
        numberOfElement = 0;
    }
}


