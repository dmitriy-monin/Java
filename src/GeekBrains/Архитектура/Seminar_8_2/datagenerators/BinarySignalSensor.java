package GeekBrains.Архитектура.Seminar_8_2.datagenerators;

import GeekBrains.Архитектура.Seminar_8_2.measurement.core.SensorGateway;
import GeekBrains.Архитектура.Seminar_8_2.measurement.entities.BinarySensorData;

import java.util.Date;
import java.util.Random;

public class BinarySignalSensor {
    private SensorGateway sensorGateway = new SensorGateway();
    private final Random random = new Random();
    private final int NUMBER_OF_SENSORS = 10;

    public boolean getSensorData() {
        Date date = new Date();
        int sensorId = random.nextInt(NUMBER_OF_SENSORS);
        boolean condition = random.nextBoolean();
        return sensorGateway.create(new BinarySensorData(sensorId, date, condition));
    }
}
