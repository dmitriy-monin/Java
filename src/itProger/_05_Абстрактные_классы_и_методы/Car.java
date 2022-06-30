package itProger._05_Абстрактные_классы_и_методы;

public class Car extends Transport {

    public Car(float speed, int weight, String color, byte[] coordinates){
        super(speed, weight, color, coordinates);
    }
    public Car(int weight, byte[] coordinates){
        super(weight, coordinates);
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Наш объект двигается со скоростью" + speed);
    }

    @Override
    public boolean stopObject() {
        this.speed = 0;
        return true;
    }

}
