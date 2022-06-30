package itProger._04_ООП._04_Полиморфизм;

public class Car extends Transport {

    public Car(float speed, int weight, String color, byte[] coordinates){
        super(speed, weight, color, coordinates);
    }
    public Car(int weight, byte[] coordinates){
        super(weight, coordinates);
    }

}
