package com.example.devices;

public class Phone implements SmartDevice {
    private final String brand;

    public Phone(String brand) {
        this.brand = brand;
    }

    @Override
    public String getInfo() {
        return "Phone - Brand: " + brand;
    }
}
