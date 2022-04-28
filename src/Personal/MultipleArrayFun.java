package Personal;

import java.lang.reflect.Array;

public class MultipleArrayFun {
    public static void main(String[] args) {
        int [] nutmeg = {1,2,3,4,5,6,7,8,9,10};
        int [][] ade = {{1,2,3,4,5},{5,4,3,2,1}};
        sumOfArray(nutmeg);
        sumOfMultipleArray(ade);

    }
    private static void sumOfArray(int [] nutmeg){
        int sum = 0;
        for (int i = 0; i < nutmeg.length; i++) {
            sum += nutmeg[i];
        }
        System.out.println(sum);
    }
    private  static  void sumOfMultipleArray(int [][] ade){
        int total = 0;
        for (int i = 0; i < ade.length; i++) {
            int sum1 = 0;
            for (int j = 0; j < ade[i].length; j++) {
                sum1 += ade[i][j];
            }
            total += sum1;
        }
        System.out.println(total);
    }
}
