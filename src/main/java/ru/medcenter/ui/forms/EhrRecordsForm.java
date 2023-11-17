package ru.medcenter.ui.forms;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class EhrRecordsForm implements UIForm {
    public SelenideElement addRecord() {
        return Selenide.$(By.xpath("//span[contains(text(),'Добавить запись ЭМК')]"));
    }

    public SelenideElement fieldSearch() {
        return Selenide.$(By.id("apexir_SEARCH"));
    }

    public SelenideElement buttonView() {
        return Selenide.$(By.xpath("//span[contains(text(),'Показать')]"));
    }

    public SelenideElement fieldTime(String text) {
        return Selenide.$(By.xpath("//a[contains(text(),'" + text + "')]"));
    }

    public SelenideElement fieldOutcomeOfHospitalization() {
        return Selenide.$(By.xpath("//span[contains(text(),'Исход госпитализации')]"));
    }
}
