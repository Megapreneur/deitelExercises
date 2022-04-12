package AssignmentTest;

public class MultipleNumber {
    boolean result;

    public void getIntegers(int firstInteger, int secondInteger) {
        result = firstInteger % secondInteger == 0;

    }

    public boolean isMultiple() {
        return  result;
    }
}
