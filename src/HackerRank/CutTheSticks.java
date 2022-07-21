package HackerRank;

import java.util.*;

public class CutTheSticks {
    public static void main(String[] args) {


    }
    public static List<Integer> cutting(List<Integer> arr){
        Collections.sort(arr);
        Map<Integer, Integer> map = new LinkedHashMap<>();
//        fill up with the linkedHashmap with the count of each element of the sorted array
        for (int i: arr) {
            if (map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i, 1);
            }
        }
//        System.out.println(map.entrySet());
        List<Integer> list = new ArrayList<>();
        int size = arr.size();
        int mapSize = map.size();
        int count = 0;

        list.add(size);

        for (Map.Entry entry: map.entrySet()) {
            if (count != map.size() - 1){
                size = size - (int)entry.getValue();
                list.add(size);
                count++;
            }
        }
        return list;

    }
}
