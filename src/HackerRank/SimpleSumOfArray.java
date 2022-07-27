package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class SimpleSumOfArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(10);
        list.add(11);
        System.out.println(sumList(list));

    }
    public static int sumList(List<Integer>arr){
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }
}
