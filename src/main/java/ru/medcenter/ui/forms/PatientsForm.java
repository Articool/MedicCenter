package ru.medcenter.ui.forms;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class PatientsForm implements UIForm {
    /**
     * Форма поиска:
     * Поле Код
     */
    public SelenideElement code() {
        return Selenide.$(By.id("SP301_SEARCH_CODE"));
    }

    /**
     * Форма поиска:
     * Кнопка поиск
     */
    public SelenideElement buttonSearch() {
        return Selenide.$(By.xpath("//span[contains(text(),'Поиск')]"));
    }

    /**
     * Форма поиска:
     * Кнопка Очистить
     */
    public SelenideElement buttonClear() {
        return Selenide.$(By.xpath("//span[contains(text(),'Очистить')]"));
    }

    /**
     * Форма Список пациентов:
     * Поле Код
     */
    public SelenideElement fieldCode(String code) {
        return Selenide.$(By.xpath("//a[contains(text(),'" + code + "')]"));
    }

}
