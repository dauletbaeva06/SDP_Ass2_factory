package com.example.factory;

import com.example.devices.Laptop;
import com.example.devices.Phone;
import com.example.devices.SmartDevice;

public class XiaomiFactory implements AbstractDeviceFactory {

    @Override
    public SmartDevice createPhone() {
        return new Phone("Xiaomi Redmi");
    }

    @Override
    public SmartDevice createLaptop() {
        return new Laptop("Xiaomi Mi Notebook");
    }
}
