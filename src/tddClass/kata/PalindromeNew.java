package tddClass.kata;

public class PalindromeNew {


    public boolean paline(int num) {
        int firstDigit = num/10000;
        int secondDigit = (num % 10000)/1000;
        int fourthDigit = (num % 100)/ 10;
        int lastDigit = (num %  10);


        if(firstDigit == lastDigit && secondDigit == fourthDigit){
            return true;
        }else
            return false;

    }

}
