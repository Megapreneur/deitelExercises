package ChapterSeven;

public class MultipleArray {
     int sum = 0;
     int product = 0;


    public static void main(String[] args) {
        bestScoresArray();
    }
    public  int getMyArray(int[] array) {
        for(int i = 0; i < array.length; i++){
            sum +=array[i];
        }
        return sum;
    }
    public  int getMyArrayCount(int[] array) {
        for(int i = 0; i < array.length; i++){
            if(i >= 10){
                array[i] = 0;
            }
            sum += array[i];
        }
        return sum;
    }

    public  int getMyArrayBonus(int[] array) {
        for(int i = 0; i < array.length; i++){
            product = array[i] * 2;
            sum += product;
        }
        return sum;
    }
    private static void bestScoresArray(){
        int [] best_score = {1,2,3,4,5,6,7,8};
        for(int i = 0; i < best_score.length; i++){
            System.out.println(best_score[i]);
        }
    }
}
