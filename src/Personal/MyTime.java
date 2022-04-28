package Personal;

public class MyTime {
    static String[][] digit = new String[5][4];

    public static void fillingSectionA(){
        for(int i = 0; i < 1; i++){
            for (int j = 0; j < 4; j++){
                digit[i][j] = "* ";
            }
        }
    }
    public static void fillingSectionB(){
        for (int i = 0; i < 3; i++){
            for(int j = 3; j < 4; j++){
                digit[i][j] = "* ";
            }
        }
    }
    public static void fillingSectionC(){
        for(int i = 2; i < 5; i++){
            for(int j = 3; j < 4; j++){
                digit[i][j] = "* ";
            }
        }
    }
    public static void fillingSectionD(){
        for(int i = 4; i < 5; i++){
            for(int j = 0; j < 4; j++){
                digit[i][j] = "* ";
            }
        }
    }
    public static void fillingSectionE(){
        for (int i = 2; i < 5; i++){
            for(int j = 0; j < 1; j++){

            }
        }
    }

}
