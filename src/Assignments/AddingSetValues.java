package Assignments;

public class AddingSetValues {
    public static void main(String[] args) {

        int[] firstArray = {12, 13, 6, 10};
        int[] SecondArray = {13, 10, 16, 15};
        sumOfDuplicatedElements(firstArray,SecondArray);
        sumOfDistinctElements(firstArray, SecondArray);

    }
      public  static  void sumOfDuplicatedElements(int[]array1 , int[] array2){
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]){
                    int total = array1[i] + array1[i];
                    sum+=total;
                }
            }
        }
        System.out.println(sum);
    }
    public static  void sumOfDistinctElements(int[] array1, int[] array2){
        int sum = 0;
        int total1 = 0;
        int total2 = 0;
        int total = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i] != array2[j]) {
                    total1 = array1[i] + array2[j];
//                    sum += total;
                }
                if (array2[j] != array1[i] ){
                    total2 = array1[i] + array2[j];
                }

            }
        }
        total = total1 + total2;
        System.out.println(total);
    }
}
