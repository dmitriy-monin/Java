package GeekBrains.Архитектура.Seminar_8_2;

import GeekBrains.Архитектура.Seminar_8_2.database.SensorsDatabase;
import GeekBrains.Архитектура.Seminar_8_2.datagenerators.AnalogSignalSensor;
import GeekBrains.Архитектура.Seminar_8_2.datagenerators.BinarySignalSensor;
import GeekBrains.Архитектура.Seminar_8_2.datagenerators.QuantizedSignalSensor;

public class App {
    public static void main(String[] args) {
        // Три типа датчиков
        AnalogSignalSensor analogSignalSensor = new AnalogSignalSensor();
        QuantizedSignalSensor quantizedSignalSensor = new QuantizedSignalSensor();
        BinarySignalSensor binarySignalSensor = new BinarySignalSensor();
        // Генерируем данные от датчиков
        for (int i = 0; i < 5; i++) {
            analogSignalSensor.getSensorData();
            quantizedSignalSensor.getSensorData();
            binarySignalSensor.getSensorData();
        }

        System.out.println(SensorsDatabase.getInstance().getAll());
    }
}