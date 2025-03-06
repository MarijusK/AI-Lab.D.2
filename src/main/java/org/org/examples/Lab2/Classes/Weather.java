package org.org.examples.Lab2.Classes;

public class Weather {
    private double temperature;
    private boolean rainExpected;

    public Weather(double temperature, boolean rainExpected) {
        this.temperature = temperature;
        this.rainExpected = rainExpected;
    }

    public double getTemperature() { return temperature; }
    public boolean isRainExpected() { return rainExpected; }
}