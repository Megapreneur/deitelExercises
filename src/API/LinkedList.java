package API;

public class LinkedList {
    private Node first;
    private int numberOfData;

    public boolean isEmpty() {
        return first == null;
    }

    public void addFirst(int data) {
        Node node = new Node();
        node.data = data;
        node.next = first;
        first = node;
        numberOfData++;
    }
    public int getSize() {
        return numberOfData;
    }

    public Node peek() {
        return first;
    }

    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
        numberOfData--;
        return temp;
    }

    public Node deleteLast() {
        Node previous = first;
        Node current = first.next;
        while (current.next != null) {
            current = current.next;
        }
        numberOfData--;
        previous = current;
        current = null;
        return previous;
    }


}