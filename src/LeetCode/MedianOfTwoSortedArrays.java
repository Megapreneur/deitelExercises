package LeetCode;

import java.sql.Array;
import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7};
        int[] arr1 = {2,4,6,8,9};

        int a = arr.length;
        int b = arr1.length;

        int c = a + b;

        int[] newArray = new int[c];

        System.arraycopy(arr, 0, newArray, 0, a);
        System.arraycopy(arr1, 0, newArray, a, b);
        Arrays.sort(newArray);

        for (int i = 0; i < newArray.length; i++) {


        }
    }
}
