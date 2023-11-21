package ru.medcenter.ui.forms;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class EhrParameterRecordForm implements UIForm {


    public SelenideElement titleEhr() {
        return Selenide.$(By.xpath("//h4[contains(text(),'Параметры записи ЭМК')]")); //Эпикриз новорожденного
    }

    public SelenideElement typeRecord() {
        return Selenide.$(By.id("P324_EMR_TYPE_ID")); //Эпикриз новорожденного
    }

    public SelenideElement buttonSave() {
        return Selenide.$(By.id("SP304_CREATE"));
    }
}
