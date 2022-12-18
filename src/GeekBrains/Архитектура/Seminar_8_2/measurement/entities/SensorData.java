package GeekBrains.Архитектура.Seminar_8_2.measurement.entities;

import java.util.Date;
import java.util.UUID;

public abstract class SensorData {
    private final UUID Id;
    private int sensorId;
    private final Date date;
    private SensorType sensorType;

    public SensorData(int sensorId, Date date) {
        this.Id = UUID.randomUUID();
        this.sensorId = sensorId;
        this.date = date;
    }

    public UUID getId() {
        return Id;
    }

    public int getSensorId() {
        return sensorId;
    }

    public Date getDate() {
        return date;
    }

    public SensorType getSensorType() {
        return sensorType;
    }

    protected void setSensorType(SensorType sensorType) {
        this.sensorType = sensorType;
    }

    @Override
    public String toString() {
        return "SensorData{" +
                "Id=" + Id +
                ", sensorId=" + sensorId +
                ", date=" + date +
                '}';
    }
}
