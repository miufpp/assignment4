package org.miu.problem3;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class LightSensor implements Sensor{
    private String location;
    private LocalTime lastUpdated;
    private double lightLevel;


    public LightSensor(String location, double lightLevel) {
        this.location = location;
        this.lastUpdated = LocalTime.now();
        this.lightLevel = lightLevel;
    }

    @Override
    public String getSensorType() {
        return "Light";
    }

    @Override
    public double getReading() {
        return lightLevel;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getLastUpdated() {
        return dt.format(lastUpdated);
    }

    @Override
    public String performAction() {
        return lightLevel < 100?"Turn on light":"Light is sufficient";
    }

}
