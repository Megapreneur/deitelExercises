package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {
    public static void main(String[] args) {
        List<Integer>firstPerson = new ArrayList<>();
        firstPerson.add(17);
        firstPerson.add(28);
        firstPerson.add(30);
        List<Integer>secondPerson = new ArrayList<>();
        firstPerson.add(99);
        firstPerson.add(16);
        firstPerson.add(8);
        System.out.println(compareTriplet(firstPerson, secondPerson));
    }
    public static List<Integer> compareTriplet(List<Integer> a, List<Integer> b){
        int counterA = 0;
        int counterB = 0;
        List<Integer> score = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if (a.get(i) > b.get(i)){
                    counterA++;
                    score.add(counterA);
                } else{
                    counterB++;
                    score.add(counterB);
                }
//                if (a.get(i) > b.get(i)){
//                    counterA++;
//                    score.add(counterA);
//                } else if (a.get(i) < b.get(i)) {
//                    counterB++;
//                    score.add(counterB);
//                }
            }
//            System.out.println(counterA);
//            System.out.println(counterB);
        }
//        score.add(counterA);
//        score.add(counterB);

        return score;
    }
}
