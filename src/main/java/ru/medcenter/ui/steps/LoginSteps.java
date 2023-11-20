package ru.medcenter.ui.steps;

import com.codeborne.selenide.conditions.Visible;
import io.qameta.allure.Step;
import ru.medcenter.ui.forms.LoginForm;

import static ru.medcenter.enums.TimeoutsEnum.MAJOR;

public class LoginSteps extends AbstractFormSteps<LoginForm> {

    @Step("Ввести логин")
    public void enterLogin(){
        form.login().shouldBe(new Visible(), MAJOR.get()).sendKeys("ITQTESTFULL2");
    }

    @Step("Ввести пароль")
    public void enterPassword(){
        form.password().sendKeys("123");
    }
    @Step("Нажать кнопку войти")
    public void clickEnterButton(){
        form.buttonEnter().click();
    }
}
