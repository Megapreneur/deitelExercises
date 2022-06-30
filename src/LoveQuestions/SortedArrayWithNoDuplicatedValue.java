package LoveQuestions;

import java.util.Arrays;

public class SortedArrayWithNoDuplicatedValue {
    static int [] nums = {2, 6, 9, 5, 7, 1};

    public static void main(String[] args) {
        sortArray(nums);

    }
    public static void sortArray(int [] nums){
        Arrays.sort(nums);
    }
    public static void removeDuplicatedValues(){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]){

                }
            }
        }
    }

}
