package itProger._04_ООП._01_Классы_и_объекты;

public class Transport {

    public float speed;
    public int weight;
    public String color;
    public byte[] coordinates;

    public void setValues(float speed, int weight, String color, byte[] coordinates){
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinates = coordinates;
    }

    public String getValues() {
        String info = " speed: " + speed + ". Weight: " + weight + ". Color: " + color + ".\n";
        String infoCoordinates = "Coordinates:\n";
        for (int i = 0; i < coordinates.length; i++) {
            infoCoordinates += coordinates[i] + "\n";
        }
        return info + infoCoordinates;
    }
}
