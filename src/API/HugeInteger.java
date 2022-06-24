package API;

public class HugeInteger {
    private static final int[] array = new int[40];

    public void parse(String input) {
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case '0' -> array[i] = 0;
                case '1' -> array[i] = 1;
                case '2' -> array[i] = 2;
                case '3' -> array[i] = 3;
                case '4' -> array[i] = 4;
                case '5' -> array[i] = 5;
                case '6' -> array[i] = 6;
                case '7' -> array[i] = 7;
                case '8' -> array[i] = 8;
                case '9' -> array[i] = 9;
            }
        }
    }

    public int[] getArrayElement() {
        return array;

    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);
        }
        return builder.toString();
    }

}
