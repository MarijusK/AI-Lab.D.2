package org.org.examples.Lab2.Classes;

public class Soil {
    private double moisture;
    private double pH;

    public Soil(double moisture, double pH) {
        this.moisture = moisture;
        this.pH = pH;
    }

    public double getMoisture() { return moisture; }
    public double getpH() { return pH; }
}