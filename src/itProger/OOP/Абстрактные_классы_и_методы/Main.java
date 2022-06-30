package itProger.OOP.Абстрактные_классы_и_методы;

public class Main {
    public static void main (String[] args){
        Car bmw = new Car(250.5f,2500, "White", new byte[] {0, 0, 0});

        Truck truck = new Truck(140.5f,5600,"Red", new byte[] {100, 0, 100});

        Car mers = new Car(1800, new byte[] {100, 100, 100});

        truck.setValues(250.5f,2500, "White", new byte[] {0, 0, 0}, true);
        System.out.println(truck.getValues());

    }
}
