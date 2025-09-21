package com.example;

import com.example.devices.SmartDevice;
import com.example.factory.*;

import java.util.ArrayList;
import java.util.List;

public class DemoRunner {

    public static List<String> runDemo() {
        List<String> output = new ArrayList<>();

        // --------- Using Simple Factory ----------
        output.add("=== Simple Factory Example ===");
        SmartDevice genericPhone = DeviceFactory.createDevice("phone", "Generic Brand");
        SmartDevice genericLaptop = DeviceFactory.createDevice("laptop", "Generic Brand");
        output.add(genericPhone.getInfo());
        output.add(genericLaptop.getInfo());

        // --------- Using Abstract Factory ----------
        output.add("\n=== Abstract Factory Example ===");
        AbstractDeviceFactory appleFactory = new AppleFactory();
        AbstractDeviceFactory samsungFactory = new SamsungFactory();
        AbstractDeviceFactory xiaomiFactory = new XiaomiFactory();

        SmartDevice iphone = appleFactory.createPhone();
        SmartDevice macbook = appleFactory.createLaptop();
        SmartDevice galaxyPhone = samsungFactory.createPhone();
        SmartDevice galaxyLaptop = samsungFactory.createLaptop();
        SmartDevice redmi = xiaomiFactory.createPhone();
        SmartDevice miNotebook = xiaomiFactory.createLaptop();

        output.add(iphone.getInfo());
        output.add(macbook.getInfo());
        output.add(galaxyPhone.getInfo());
        output.add(galaxyLaptop.getInfo());
        output.add(redmi.getInfo());
        output.add(miNotebook.getInfo());

        return output;
    }
}
