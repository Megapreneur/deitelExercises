package ChapterSeven;

import java.security.SecureRandom;
import java.util.Arrays;

public class DiceRolling {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int [] array = new int[11];
        for (int i = 1; i <= 600_000 ; i++) {
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;

            int sum = die1 + die2;
            switch (sum) {
                case 2 -> array[0]++;
                case 3 -> array[1]++;
                case 4 -> array[2]++;
                case 5 -> array[3]++;
                case 6 -> array[4]++;
                case 7 -> array[5]++;
                case 8 -> array[6]++;
                case 9 -> array[7]++;
                case 10 -> array[8]++;
                case 11 -> array[9]++;
                case 12 -> array[10]++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
