package GeekBrains.Архитектура.Seminar_8_2.measurement.entities;

import java.util.Date;

public class QuantizedSensorData extends SensorData {
    private final int sensorData;

    public QuantizedSensorData(int sensorId, Date date, int sensorData) {
        super(sensorId, date);
        this.sensorData = sensorData;
        this.setSensorType(SensorType.QUANTIZED);
    }

    public int getSensorData() {
        return sensorData;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "sensorData=" + sensorData +
                '}';
    }
}
