package Personal;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Practise {
    public static void main(String... nutmeg){
        SecureRandom rand = new SecureRandom();




        double x = rand.nextDouble();
        double y = rand.nextDouble();

        double z = Math.min(x, y);




        System.out.println(z);

        //Personal.Practise.arrays();



    }
    public  void arrays(){
        for(int i = 0; i <= 10; i++) {
            System.out.println();
            for (int j = 10; j >= 1; j--)
                System.out.println("*");
        }
    }
    public void multiplication(){
        for(int i = 1; i <= 12; i++){
            for (int a = 1; a <= 12; a++){
                int result = a * 2;
            }
        }
    }
    public static void arrayList(){
        ArrayList fruitList = new ArrayList();
        fruitList.add("Mango");

    }
}
