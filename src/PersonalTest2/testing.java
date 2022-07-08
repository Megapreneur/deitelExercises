package PersonalTest2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class testing {
    public static void main(String[] args) {
        ArrayList<Integer> amaka = new ArrayList<>();
        Queue<Integer> str_queue = new LinkedList<>();
        amaka.add(0, 35);
        amaka.add(1, 390);
        amaka.add(2, 391);
        amaka.add(3, 392);
        amaka.add(4, 393);


        System.out.println(amaka);
        amaka.remove(2);
        System.out.println(amaka);
        System.out.println(amaka.get(2));
        str_queue.add(12);
        str_queue.add(45);
        str_queue.add(40);
        str_queue.add(44);
        str_queue.add(64);
        System.out.println(str_queue);
        str_queue.remove();
        System.out.println(str_queue);

    }
}
