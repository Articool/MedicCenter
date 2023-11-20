package ru.medcenter.ui.forms;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class MainForm implements UIForm {

    public SelenideElement rate() {
        return Selenide.$(By.id("P1_RATE"));
    }
}

