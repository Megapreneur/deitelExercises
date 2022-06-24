package Personal;

public class ArrayPractiseNew {
    public static void main(String[] args) {
//        int sum = 0;
//        int[] array = {1, 2, 3, 4, 5};
//        for (int j : array) {
//            sum += j;
//        }
//        System.out.println("The total sum of all numbers is " + sum);
        int [] array = {1, 2, 3, 4, 5};

        for (int value:array) {
            System.out.printf(" %d", value);
        }
        modifyArray(array);
        System.out.println("The value of the modified array are:%n");

        for(int value: array){
            System.out.printf(" %d", value);
        }
        System.out.printf("" +
                        "%n%nEffects of passing array element value:%n" +
                        "array[3] before modifyElement: %d%n", array[3]);
        modifyElement(array[3]);
        System.out.printf(
                "array[3] after modifyElement: %d%n", array[3]);
    }

    private static void modifyElement(int element) {
        element *= 2;
    }

    private static void modifyArray(int[] array2) {
        for (int counter = 0; counter < array2.length; counter++) {
            array2[counter] *= 2;

        }
    }
}
