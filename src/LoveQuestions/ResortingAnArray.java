package LoveQuestions;

import java.util.Arrays;

public class ResortingAnArray {
    public static void main(String[] args) {
        int[] nums = {4, 0, 1, 0, 12, 7, 0};
        rearrangeArray(nums);
    }
    public static void rearrangeArray(int[] arr) {
        int[] newArray = new int[5];
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArray[a] = arr[i];
                ++a;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}