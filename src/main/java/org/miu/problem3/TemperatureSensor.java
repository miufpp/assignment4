package org.miu.problem3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TemperatureSensor implements Sensor{
    private String location;
    private LocalTime lastupdated;
    private double temperature;

    public TemperatureSensor(String location, double temperature){
        this.location=location;
        this.lastupdated=LocalTime.now();
        this.temperature=temperature;
    }

    @Override
    public String getSensorType() {
        return "Temperature";
    }

    @Override
    public double getReading() {
        return temperature;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getLastUpdated() {
        this.lastupdated= LocalTime.now();
        return dt.format(lastupdated);
    }

    @Override
    public String performAction() {
        return temperature>30?"Turn on the Heater":"Temperature is in normal range";
    }
}
