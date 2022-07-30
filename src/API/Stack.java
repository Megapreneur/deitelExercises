package API;

import java.util.EmptyStackException;

public class Stack {
    final String [] myBag = new String[5];
    private int numberOfItem;

    public boolean isEmpty() {
        return numberOfItem == 0;
    }
    public void push(String items) {
        if (numberOfItem < myBag.length){
            myBag[numberOfItem] = items;
            numberOfItem++;
        }
    }
    public int size() {
        return numberOfItem;
    }
    public String peek() {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return myBag[numberOfItem-1];
    }
    public String pop() {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        numberOfItem--;
        return myBag[numberOfItem];
    }
}
