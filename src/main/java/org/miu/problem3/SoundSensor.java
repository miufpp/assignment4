package org.miu.problem3;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class SoundSensor implements Sensor{
    private String location; //todo change type to String
    private LocalTime lastupdated;//
    private double soundlevel;

    public SoundSensor(String location, double soundlevel) {
        this.location = location;
        this.lastupdated = LocalTime.now();
        this.soundlevel = soundlevel;
    }

    @Override
    public String getSensorType() {
        return "Sound";
    }

    @Override
    public double getReading() {
        return soundlevel;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getLastUpdated() {
        return Sensor.dt.format(lastupdated);
    }

    @Override
    public String performAction() {
        return soundlevel>70?"Turn on noise cancellation":"Sound is within normal range";
    }
}
