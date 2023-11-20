package ru.medcenter.core;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;


public class DriverManager {

    private static final Map<Long, WebDriver> driverMap = new HashMap<>();

    public static void put(WebDriver driver) {
        driverMap.put(Thread.currentThread().getId(), driver);
    }

    public static WebDriver get() {
        if (driverMap.containsKey(Thread.currentThread().getId())) {
            return driverMap.get(Thread.currentThread().getId());
        } else {
            throw new RuntimeException("Не инициализирован драйвер");
        }
    }

    public static void tearDown() {
        get().quit();
        if (driverMap.containsKey(Thread.currentThread().getId())) {
            driverMap.get(Thread.currentThread().getId()).quit();
            driverMap.remove(Thread.currentThread().getId());
        }
    }
}
