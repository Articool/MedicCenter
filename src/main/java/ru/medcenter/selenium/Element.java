package ru.medcenter.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.medcenter.core.DriverManager;
import ru.medcenter.enums.ConditionTimeoutsEnum;
import ru.medcenter.enums.TimeoutsEnum;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class Element extends LocatorWrapper implements Waitable {
    public Element(By by) {
        super(by);
    }

    @Override
    public void waitUntil(ExpectedCondition<?> condition, TimeoutsEnum timeout) {
        webDriverWait(timeout.get()).until(condition);
    }

    @Override
    public void waitUntil(ConditionTimeoutsEnum condition, TimeoutsEnum timeout) {
        WebElement element = super.init();
        switch (condition) {
            case VISIBLE:
                waitUntil(visibilityOf(element), timeout);
                break;
            case NOTVISIBLE:
                waitUntil(ExpectedConditions.not(visibilityOf(element)), timeout);
                break;
        }
    }

    @Override
    public WebElement waitUntilWithElement(ConditionTimeoutsEnum condition, TimeoutsEnum timeout) {
        WebElement element = super.init();
        switch (condition) {
            case VISIBLE:
                waitUntil(visibilityOf(element), timeout);
                break;
            case NOTVISIBLE:
                waitUntil(ExpectedConditions.not(visibilityOf(element)), timeout);
                break;
        }
        return element;
    }

    private WebDriverWait webDriverWait(Duration timeout) {
        DriverManager.get().manage().timeouts().implicitlyWait(timeout);
        return new WebDriverWait(DriverManager.get(), Duration.ofSeconds(20));
    }
}
