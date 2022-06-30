package itProger._08_Интерфейсы;

public class Car extends Transport implements ILight {

    private boolean isOn;

    public Engine engine = new Engine();
    public Car(float speed, int weight, String color, byte[] coordinates){
        super(speed, weight, color, coordinates);
    }

    public Car() {}

    @Override
    public void moveObject(float speed) {
        System.out.println("Наш объект двигается со скоростью " + speed);
    }

    @Override
    public boolean stopObject() {
        this.speed = 0;
        return true;
    }

    @Override
    public void setLight(boolean set) {
        isOn = set;
        if (isOn)
            System.out.println("Фары включены");
        else
            System.out.println("Фары выключены");
    }

    @Override
    public void blinkLight() {
        System.out.println("Мы моргаем фарами");
    }
}
