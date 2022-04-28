package Personal;

public class ArrayPractiseNew {
    public static void main(String[] args) {
        int sum = 0;
        int[] array = {1, 2, 3, 4, 5};
        for (int j : array) {
            sum += j;
        }
        System.out.println("The total sum of all numbers is " + sum);
    }
}
