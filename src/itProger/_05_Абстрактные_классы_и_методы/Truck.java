package itProger._05_Абстрактные_классы_и_методы;

public class Truck extends Transport {

    private boolean isLoaded;
    public Truck(float speed, int weight, String color, byte[] coordinates){
        super(speed, weight, color, coordinates);
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

    public Truck(float speed, int weight, String color, byte[] coordinates, boolean isLoaded){
        super(speed, weight, color, coordinates);
        this.isLoaded = isLoaded;
    }

    public void setValues(float speed, int weight, String color, byte[] coordinates, boolean isLoaded){
        super.setValues(speed, weight, color, coordinates);
        this.isLoaded = isLoaded;
    }

    @Override
    protected String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }

    public String getLoaded(){
        if(isLoaded)
            return "Грузовик загружен";
        else
            return "Грузовик не загружен";
    }
}
