package LoveQuestions;

import java.util.Arrays;

public class ResortingAnArray {
    public static void main(String[] args) {
        int[] nums = {0,0,0,4, 0, 1, 0, 12, 7, 0};
        rearrangeArray(nums);
    }
    public static void rearrangeArray(int[] arr) {
//        int[] newArray = new int[arr.length];
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[a] = arr[i];
                ++a;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}