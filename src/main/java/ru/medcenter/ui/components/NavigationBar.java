package ru.medcenter.ui.components;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public interface NavigationBar {

    default SelenideElement home() {
        return Selenide.$(By.xpath("//a[contains(text(),'Главная')]"));
    }

    default SelenideElement schedule() {
        return Selenide.$(By.xpath("//a[contains(text(),'Расписание')]"));
    }

    default SelenideElement patients() {
        return Selenide.$(By.xpath("//a[contains(text(),'Пациенты')]"));
    }

    default SelenideElement exit() {
        return Selenide.$(By.xpath("//a[contains(text(),'Выход')]"));
    }

    @Step("Клик на кнопку Главная")
    default void clickButtonHome() {
        home().click();
    }

    @Step("Клик на кнопку Расписание")
    default void clickButtonSchedule() {
        schedule().click();
    }

    @Step("Клик на кнопку Пациенты")
    default void clickButtonPatients() {
        patients().click();
    }

    @Step("Клик на кнопку Выход")
    default void clickButtonExit() {
        exit().click();
    }
}
