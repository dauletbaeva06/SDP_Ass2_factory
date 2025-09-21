package com.example.factory;

import com.example.devices.Laptop;
import com.example.devices.Phone;
import com.example.devices.SmartDevice;

public class AppleFactory implements AbstractDeviceFactory {

    @Override
    public SmartDevice createPhone() {
        return new Phone("Apple iPhone");
    }

    @Override
    public SmartDevice createLaptop() {
        return new Laptop("Apple MacBook");
    }
}
