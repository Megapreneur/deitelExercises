package API;

public class Queue {
    private final int[] myElements = new int[10];
    private int numberOfElement;
    private int front = -1;
    private int back = -1;

    public boolean isEmpty() {
        return front == -1 && back == -1;
    }

    public void add(int element) {
        numberOfElement++;
        if (front == -1 && back == -1){
            front = back = 0;
            myElements[back] = element;
        } else if (back < myElements.length) {
            myElements[back] = element;
            back++;
        }
    }
    public int size() {
        return numberOfElement;
    }

    public void remove() {
        if (back == front){
            front = back = -1;
        }
        else {
            front++;
        }
        numberOfElement--;
    }
    public int peek() {
        return myElements[front];
    }
}
