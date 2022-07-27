package HackerRank;

public class SimpleSumOfArray {
    public static void main(String[] args) {
        int [] array ={1,2,3,4,10,11};
        System.out.println(arraySum(array));

    }
    public static int arraySum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
