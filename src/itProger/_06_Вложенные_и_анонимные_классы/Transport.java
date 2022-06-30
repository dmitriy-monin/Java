package itProger._06_Вложенные_и_анонимные_классы;

public abstract class Transport {

    protected float speed;
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
        System.out.println(this.getValues());
    }

    public abstract void moveObject(float speed);
    public abstract boolean stopObject();
    protected void setValues(float speed, int weight, String color, byte[] coordinates){
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinates = coordinates;
    }

    protected String getValues() {
        String info = "Object Speed: " + this.speed + ". Weight: " + this.weight + ". Color: " + this.color + ".\n";
        String infoCoordinates = "Coordinates:\n";
        for (int i = 0; i < coordinates.length; i++) {
            infoCoordinates += coordinates[i] + "\n";
        }
        return info + infoCoordinates;
    }

    class Engine {

        private boolean isReady;
        private int km;

        public void setValues(boolean isReady, int km){
            this.isReady = isReady;
            this.km = km;
        }

        public void isReady(boolean isReady){
            this.isReady = isReady;
        }

        public void infoEngine(){
            if(isReady)
                System.out.println("Двигатель исправен");
            else
                System.out.println("Нет, он не работает. Он проехал уже " + km + " км");
        }
    }
}