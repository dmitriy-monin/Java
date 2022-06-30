package itProger._04_ООП._01_Классы_и_объекты;

public class Main {
    public static void main (String[] args){
        Transport bmw = new Transport();
        bmw.setValues(250.5f,2500, "White", new byte[] {0, 0, 0});
        System.out.println("BMW" + bmw.getValues());

        Transport truck = new Transport();
        truck.speed = 140.5f;
        truck.weight = 5600;
        truck.color = "Red";
        truck.coordinates = new byte[] {100, 0, 100};
        System.out.println("Truck" + truck.getValues());
    }
}
