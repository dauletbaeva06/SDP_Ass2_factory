package com.example.factory;

import com.example.devices.Laptop;
import com.example.devices.Phone;
import com.example.devices.SmartDevice;

public class DeviceFactory {

    public static SmartDevice createDevice(String type, String brand) {
        return switch (type.toLowerCase()) {
            case "phone" -> new Phone(brand);
            case "laptop" -> new Laptop(brand);
            default -> throw new IllegalArgumentException("Unknown device type: " + type);
        };
    }
}

