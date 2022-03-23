package Assignments;

public class TrianglePrinting {
    public static void main(String[] args) {

            for (int count = 0; count < 10; count++){
                for (int a = 0; a < count + 1; a++)
                    System.out.print("*");
                System.out.println();
            }
            for(int count = 11; count > 0; count--){
                for(int b = 0; b < count - 1; b++)
                    System.out.print("*");
                System.out.println();
            }
//              for (int count = 0; count < 10; count++){
//                for (int a = 11; a <= count + 1; a++)
//                    System.out.print(" ");
//                    System.out.print("*");
//                System.out.println();
//              }

    }
}
