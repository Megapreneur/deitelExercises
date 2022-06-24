package API;

public class Set{


    public static ArrayList arrayList = new ArrayList();


    public void add(int index, int element) {
        if (elementExist(element))
            arrayList.add(index, element);

    }

    public int size() {
        return arrayList.getSize();
    }

    public boolean isEmpty() {
        return arrayList.isEmpty();
    }
    private boolean elementExist(int element){
        for (int i = 0; i < arrayList.getSize(); i++) {
            if (element == arrayList.get(i)){
                return false;
            }

        }
        return true;
    }
}
