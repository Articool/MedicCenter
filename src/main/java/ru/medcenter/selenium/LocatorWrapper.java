package ru.medcenter.selenium;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.medcenter.core.DriverManager;

@AllArgsConstructor
@Getter
public class LocatorWrapper {
    private final By by;

    public WebElement init(){
        return DriverManager.get().findElement(by);
    }
}
