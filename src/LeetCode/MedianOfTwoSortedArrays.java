package LeetCode;

import java.sql.Array;
import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,10, 13,14};
        int[] arr1 = {2,4,6,8,11, 12};

        int a = arr.length;
        int b = arr1.length;

        int c = a + b;

        int[] newArray = new int[c];

        System.arraycopy(arr, 0, newArray, 0, a);
        System.arraycopy(arr1, 0, newArray, a, b);
        Arrays.sort(newArray);

        double m = 0;

        m = (double) (newArray[(c - 1) / 2] + newArray[c / 2]) / 2.0;
        System.out.println(Arrays.toString(newArray));
        System.out.println(m);
    }
}
