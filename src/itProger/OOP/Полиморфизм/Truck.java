package itProger.OOP.Полиморфизм;

public class Truck extends Transport {

    private boolean isLoaded;
    public Truck(float speed, int weight, String color, byte[] coordinates){
        super(speed, weight, color, coordinates);
    }

    public Truck(float speed, int weight, String color, byte[] coordinates, boolean isLoaded){
        super(speed, weight, color, coordinates);
        this.isLoaded = isLoaded;
    }

    public void setLoaded(boolean loaded) {
        this.isLoaded = loaded;
    }

    public void getLoaded(){
        if(isLoaded)
            System.out.println("Грузовик загружен");
        else
            System.out.println("Грузовик не загружен");
    }
}
