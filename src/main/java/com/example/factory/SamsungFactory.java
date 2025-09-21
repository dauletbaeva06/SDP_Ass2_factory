package com.example.factory;

import com.example.devices.Laptop;
import com.example.devices.Phone;
import com.example.devices.SmartDevice;

public class SamsungFactory implements AbstractDeviceFactory {

    @Override
    public SmartDevice createPhone() {
        return new Phone("Samsung Galaxy");
    }

    @Override
    public SmartDevice createLaptop() {
        return new Laptop("Samsung Galaxy Book");
    }
}
