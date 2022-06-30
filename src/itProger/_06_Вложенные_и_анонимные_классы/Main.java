package itProger._06_Вложенные_и_анонимные_классы;

public class Main {
    public static void main (String[] args){
        Car bmw = new Car(250.5f,2500, "White", new byte[] {0, 0, 0});
        bmw.engine.setValues(false,2000);
        bmw.engine.infoEngine();

        Truck truck = new Truck(140.5f,5600,"Red", new byte[] {100, 0, 100});
        truck.engine.setValues(true,100);
        truck.engine.infoEngine();

        Car mers = new Car(1800, new byte[] {100, 100, 100});
        mers.engine.setValues(false,10000);
        mers.engine.infoEngine();

        truck.setValues(250.5f,2500, "White", new byte[] {0, 0, 0}, true);
        System.out.println(truck.getValues());

        Car flyCar = new Car(250.5f,2500, "White", new byte[] {0, 0, 0}){
            @Override
            public void moveObject(float speed) {
                super.moveObject(speed);

                this.engine.isReady(true);
                System.out.println("Машина летит");
            }
        };
        flyCar.moveObject(450);
    }
}
