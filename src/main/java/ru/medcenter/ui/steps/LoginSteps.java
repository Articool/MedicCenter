package ru.medcenter.ui.steps;

import com.codeborne.selenide.conditions.Visible;
import io.qameta.allure.Step;
import ru.medcenter.builders.TestDataBuilder;
import ru.medcenter.ui.forms.LoginForm;

import static ru.medcenter.enums.TimeoutsEnum.MAJOR;

public class LoginSteps extends AbstractFormSteps<LoginForm> {

    @Step("Ввести логин пользователя {builder.login}")
    public void enterLogin(TestDataBuilder testDataBuilder){
        form.login().shouldBe(new Visible(), MAJOR.get()).sendKeys(testDataBuilder.getLogin());
    }

    @Step("Ввести пароль пользователя {builder.password}")
    public void enterPassword(TestDataBuilder builder){
        form.password().sendKeys(builder.getPassword());
    }
    @Step("Нажать кнопку войти")
    public void clickEnterButton(){
        form.buttonEnter().click();
    }
}

