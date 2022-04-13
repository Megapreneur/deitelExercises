package ChapterFive;

public class IntegersDivisibleBy3 {
    int sum = 0;

    public void collectNumber(int limit) {
        for(int i = 1;i <= limit; i++){
            if(i % 3 == 0){
                sum = sum + i;
            }
        }
    }

    public int getResult() {
        return sum;
    }
}
