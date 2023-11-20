package ru.medcenter.ui.forms;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class LoginForm implements UIForm {

    public SelenideElement login() {
        return Selenide.$(By.id("SP101_USERNAME"));
    }

    public SelenideElement password() {
        return Selenide.$(By.id("SP101_PASSWORD"));
    }

    public SelenideElement buttonEnter() {
        return Selenide.$(By.id("P101_LOGIN"));
    }
}

