package ru.medcenter.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import ru.medcenter.enums.ConditionTimeoutsEnum;
import ru.medcenter.enums.TimeoutsEnum;

public interface Waitable {
    void waitUntil(ExpectedCondition<?> condition, TimeoutsEnum timeout);
    void waitUntil(ConditionTimeoutsEnum condition, TimeoutsEnum timeout);
    WebElement waitUntilWithElement(ConditionTimeoutsEnum condition,TimeoutsEnum timeout);
}
