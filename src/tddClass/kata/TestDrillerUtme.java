package tddClass.kata;

public class TestDrillerUtme {
    static int amount;
    public static int testDriller(int quantity) {
        if(quantity >= 1 && quantity <= 4){
            amount = quantity * 2000;
        }
        else if(quantity >= 5 && quantity <= 9){
            amount = quantity * 1800;
        }
        else if(quantity >= 10 && quantity <= 29){
            amount = quantity * 1600;
        }
        else  if(quantity >= 30 && quantity <= 49){
            amount = quantity * 1500;
        }
        else if(quantity >= 50 && quantity <= 99){
            amount = quantity * 1300;
        }
        else if(quantity >= 100 && quantity <= 199){
            amount = quantity * 1200;
        }
        else  if(quantity >= 200 && quantity <= 499){
            amount = quantity * 1100;
        }
        else if(quantity >=500)
            amount = quantity * 1000;
        return  amount;
    }
    public static int getAmount() {
        return amount;
    }
}
