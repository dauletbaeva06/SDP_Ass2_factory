package com.example.devices;

public class Laptop implements SmartDevice {
    private final String brand;

    public Laptop(String brand) {
        this.brand = brand;
    }

    @Override
    public String getInfo() {
        return "Laptop - Brand: " + brand;
    }
}
