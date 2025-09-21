package com.example.factory;

import com.example.devices.SmartDevice;

public interface AbstractDeviceFactory {
    SmartDevice createPhone();
    SmartDevice createLaptop();
}
