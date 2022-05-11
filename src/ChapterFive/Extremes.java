package ChapterFive;

public class Extremes {
    int i;
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    int i6;
    int largestNumber;
    int smallestNumber;
    int difference;
    public void getNumbers(int i, int i1, int i2, int i3, int i4, int i5, int i6) {
        this.i = i;
        this.i1 = i1;
        this.i2 = i2;
        this.i3 =i3;
        this.i4 = i4;
        this.i5 = i5;
        this.i6 = i6;
    }
    public int getLargestNumber() {
        largestNumber = Math.max(i6, Math.max(i5, Math.max(i4, Math.max(i3, Math.max(i2, Math.max(i1, i))))));
        return largestNumber;
    }

    public int getSmallestNumber() {
        smallestNumber = Math.min(i6, Math.min(i5, Math.min(i4, Math.min(i3, Math.min(i2, Math.min(i1, i))))));
        return smallestNumber;
    }

    public int extreme() {
        difference = getLargestNumber() + getSmallestNumber();
        return difference;
    }
}
