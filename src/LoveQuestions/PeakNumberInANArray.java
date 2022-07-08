package LoveQuestions;

public class PeakNumberInANArray {
    private static int peakValue;
    public static void main(String[] args) {
        int[] nums = {8, 8 ,6, 5, 12, 2};
        System.out.println(findPeak(nums));
    }
    public static int findPeak(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                peakValue = i;
            } else if (arr[0] > arr[1]) {
                peakValue = arr[0];
            } else if (arr[arr.length - 1] > arr[arr.length - 2]) {
                peakValue = arr[arr.length - 1];
            }
        }
        return peakValue;
    }
}
