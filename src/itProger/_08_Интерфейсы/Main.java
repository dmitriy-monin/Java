package itProger._08_Интерфейсы;

public class Main {
    public static void main (String[] args){
        Car bmw = new Car();
        bmw.setLight(true);
        bmw.blinkLight();
        bmw.moveObject(100);
        bmw.engine.isReady(false);
        bmw.setValues(234,1800,"red", new byte[]{4, 7, 9});
        
        bmw.engine.infoEngine();
    }
}