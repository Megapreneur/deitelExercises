package ChapterSevenTest;

import ChapterSeven.MultipleArray;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MultipleArrayTest {
    @Test
    public void arrayCountIsCreatedTest(){
        int [] array = {1,3,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
        MultipleArray array1 = new MultipleArray();
        assertEquals(232, array1.getMyArray(array));
    }
    @Test
    public void getArrayCountSumTest(){
        int [] array = {3,2,3,4,5,6,7,8,9,10,0,0,0,12,0,0,0,0,0,0};
        MultipleArray array1 = new MultipleArray();
        assertEquals(57, array1.getMyArrayCount(array));
    }
    @Test
    public void sumArrayBonusTest(){
        int [] bonus = {1,2,3,4,5,6,7,8,9,10};
        MultipleArray bonus1 = new MultipleArray();
        assertEquals(110, bonus1.getMyArrayBonus(bonus));
    }

}
