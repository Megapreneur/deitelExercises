package PersonalTest2;

public class ArrayMultidimensionalPractise {
    public static void main(String[] args) {
        int total = 0;
        int[][] ray = {{2,4,6}, {1,2,3,4}};
        for(int i = 0; i < ray.length; i++){
            int sum = 0;
            for(int j = 0; j < ray[i].length; j++){
                sum += ray[i][j];
            }
            total += sum;
            System.out.println(sum);
        }
        System.out.println(total);
    }
}
