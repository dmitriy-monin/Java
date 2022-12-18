package GeekBrains.Архитектура.Seminar_8_2.measurement.core;

import GeekBrains.Архитектура.Seminar_8_2.database.Database;
import GeekBrains.Архитектура.Seminar_8_2.database.SensorsDatabase;
import GeekBrains.Архитектура.Seminar_8_2.measurement.entities.SensorData;

public class SensorGateway implements SensorAdapter {
    Database database = SensorsDatabase.getInstance();
    @Override
    public boolean create(SensorData sensorData) {
        return database.create(sensorData);
    }
}
