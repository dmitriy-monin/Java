package GeekBrains.Архитектура.Seminar_8_2.database;

import GeekBrains.Архитектура.Seminar_8_2.measurement.entities.SensorData;

import java.util.Collection;
import java.util.UUID;

public interface Database {
    boolean create(SensorData item);
    SensorData read(UUID uuid);
    boolean delete(UUID uuid);
    Collection<SensorData> getAll();
}
