package itProger._04_ООП._02_Конструкторы_классов;

public class Main {
    public static void main (String[] args){
        Transport bmw = new Transport(250.5f,2500, "White", new byte[] {0, 0, 0});

        Transport truck = new Transport(140.5f,5600,"Red", new byte[] {100, 0, 100});

        Transport mers = new Transport(1800, new byte[] {100, 100, 100});

    }
}
