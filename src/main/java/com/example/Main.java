package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> results = DemoRunner.runDemo();
        results.forEach(System.out::println);
    }
}
