package Personal;

public class ToStringDemo {
    String color = "blue";
    String year = "2021";
    String model = "Benz";

    @Override
    public String toString(){
        String motor = color+"\n"+year+"\n"+model+"\n";

        return motor;
    }
}
