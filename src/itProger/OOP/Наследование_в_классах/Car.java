package itProger.OOP.Наследование_в_классах;

public class Car extends Transport {

    public Car(float speed, int weight, String color, byte[] coordinates){
        super(speed, weight, color, coordinates);
    }
    public Car(int weight, byte[] coordinates){
        super(weight, coordinates);
    }

}
