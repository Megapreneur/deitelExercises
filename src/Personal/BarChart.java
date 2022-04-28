package Personal;

public class BarChart {
    public static void main(String[] args) {
        int[]scores = {1,2,3,4,5,6,5,4,3,2,1};

        System.out.println("Grade distribution");

        for(int i = 0; i < scores.length; i++){
            if(i == 10){
                System.out.printf("%5d: ", 100);
            }else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 +9);
            }
            for(int a = 0; a < scores[i];a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
