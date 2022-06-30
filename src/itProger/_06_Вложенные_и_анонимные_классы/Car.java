package itProger._06_Вложенные_и_анонимные_классы;

public class Car extends Transport {

    public Engine engine = new Engine();
    public Car(float speed, int weight, String color, byte[] coordinates){
        super(speed, weight, color, coordinates);
    }
    public Car(int weight, byte[] coordinates){
        super(weight, coordinates);
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Наш объект двигается со скоростью " + speed);
    }

    @Override
    public boolean stopObject() {
        this.speed = 0;
        return true;
    }

}
