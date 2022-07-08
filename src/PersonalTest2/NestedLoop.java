package PersonalTest2;

public class NestedLoop {
//    public static void main(String[] args) {
//        for (int i = 1; i < 4; i++) {
//            System.out.println();
//            for (int j = 1; j < 4; j++) {
//                System.out.print(" ");
//                for (int k = 1; k < 3; k++) {
//                    System.out.print("*");
//
//                }
//            }
////            System.out.println();
//
//        }
//    }
    static String name = "Ademola";
    static String re = name.toLowerCase();
    static int ree = name.length();
    static boolean reee = name.equals("Ademola ");
    static boolean reees = name.equalsIgnoreCase("ADemola");

    public static void main(String[] args) {
        System.out.println(re);
        System.out.println(ree);
        System.out.println(reee);
        System.out.println(reees);
    }

}
