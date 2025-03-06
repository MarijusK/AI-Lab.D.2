package org.org.examples.Lab2.Classes;

public class Plant {
    private String type;
    private String healthStatus;

    public Plant(String type, String healthStatus) {
        this.type = type;
        this.healthStatus = healthStatus;
    }

    public String getType() { return type; }
    public String getHealthStatus() { return healthStatus; }
}