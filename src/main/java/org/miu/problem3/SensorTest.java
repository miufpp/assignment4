package org.miu.problem3;

import java.time.LocalTime;

public class SensorTest {
    public static void main(String[] args) {
        LightSensor lightSensor=new LightSensor("kitchen",24);
        Sensor lightSensor2=new LightSensor("bedroom",180);
        SoundSensor soundSensor=new SoundSensor("garden",22.4);
        TemperatureSensor temperatureSensor=new TemperatureSensor("balcony",33.33);
        Sensor soundSensor2=new SoundSensor("compound",94.44);
        Sensor[] sensorArr=new Sensor[]{lightSensor,lightSensor2,soundSensor,temperatureSensor,soundSensor2};

        for(Sensor sensor:sensorArr){
            System.out.printf("Sensor Type: %s\nReading: %.1f\nLocation: %s\nLast Updated: %s\nAction: %s\n",sensor.getSensorType(),sensor.getReading(),sensor.getLocation(),sensor.getLastUpdated(),sensor.performAction());
        }
    }
}
