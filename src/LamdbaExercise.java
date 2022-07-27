import java.security.SecureRandom;
import java.util.stream.IntStream;

public class LamdbaExercise {
    public static void main(String[] args) {
//        int result = IntStream.rangeClosed(1, 20).filter(x -> x % 2 != 0).map(x -> x * x * x).sum();
//        System.out.println(result);
//
        int factorial = IntStream.rangeClosed(1, 99).reduce((acct, el) ->  acct * el).getAsInt();
        System.out.println(factorial);

//        SecureRandom = new SecureRandom();
//        secureRandom.ints(10, 1, 7).filter(x -> x % 2 == 0).forEach(System.out::println);
    }
}
