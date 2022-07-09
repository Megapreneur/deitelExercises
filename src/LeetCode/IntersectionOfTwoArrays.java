package LeetCode;

import java.util.Arrays;

public class IntersectionOfTwoArrays {


    public static void main(String[] args) {
        int [] arr = {1,2,2,1};
        int [] arr1 = {2,2};
        intersectOfTwoArrays(arr, arr1);

    }
    public static void intersectOfTwoArrays(int[]a, int[]b){
        int count=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < b.length; j++) {
                if (a[i] == b[j]){
                    a[i] = b[j];
                    a[count++]=a[i];
                }

            }
            System.out.println(Arrays.toString(a));

        }

    }
}
