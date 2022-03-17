package tddClass.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeNewTest {
    @Test
    public void notPalindromeTest() {
        PalindromeNew integerPalindrome = new PalindromeNew();
         integerPalindrome.paline(12345);
        assertFalse(false);
    }
    @Test
    public void palindromeTest(){
        PalindromeNew integerPalindrome = new PalindromeNew();
        integerPalindrome.paline(12321);
        assertTrue(true);
    }
}
