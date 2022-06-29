package itProger.OOP.Наследование_в_классах;

public class Transport {

    private float speed;
    private int weight;
    private String color;
    private byte[] coordinates;

    public Transport(float speed, int weight, String color, byte[] coordinates){
        System.out.println("Объект создан");
        setValues(speed, weight, color, coordinates);
        System.out.println(getValues());
    }

    public Transport(int weight, byte[] coordinates) {
        System.out.println("Объект создан");
        this.weight = weight;
        this.coordinates = coordinates;
        System.out.println(getValues());
    }
    protected void setValues(float speed, int weight, String color, byte[] coordinates){
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinates = coordinates;
    }

    protected String getValues() {
        String info = "Object Speed: " + speed + ". Weight: " + weight + ". Color: " + color + ".\n";
        String infoCoordinates = "Coordinates:\n";
        for (int i = 0; i < coordinates.length; i++) {
            infoCoordinates += coordinates[i] + "\n";
        }
        return info + infoCoordinates;
    }
}