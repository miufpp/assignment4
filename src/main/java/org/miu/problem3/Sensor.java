package org.miu.problem3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public interface Sensor {
    DateTimeFormatter dt= DateTimeFormatter.ofPattern("hh:mm a");
    public String getSensorType();
    public double getReading();
    public String getLocation();
    public String getLastUpdated();
    public String performAction();
}
