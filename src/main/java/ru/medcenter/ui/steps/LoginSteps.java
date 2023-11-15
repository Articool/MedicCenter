package ru.medcenter.ui.steps;

import com.google.inject.Inject;
import io.qameta.allure.Step;
import ru.medcenter.enums.ConditionTimeoutsEnum;
import ru.medcenter.ui.forms.AbstractFormSteps;
import ru.medcenter.ui.forms.LoginForm;

import static ru.medcenter.enums.TimeoutsEnum.MAJOR;
import static ru.medcenter.enums.TimeoutsEnum.SUPER_BIG;

public class LoginSteps extends AbstractFormSteps<LoginForm> {

    @Step("Ввести логин")
    public void enterLogin(){
        form.login().waitUntilWithElement(ConditionTimeoutsEnum.VISIBLE,SUPER_BIG).sendKeys("ITQTESTFULL2");
    }

    @Step("Ввести пароль")
    public void enterPassword(){
        form.password().waitUntilWithElement(ConditionTimeoutsEnum.VISIBLE,MAJOR).sendKeys("123");
    }
    @Step("Нажать кнопку войти")
    public void clickEnterButton(){
        form.buttonEnter().waitUntilWithElement(ConditionTimeoutsEnum.VISIBLE,MAJOR).click();
    }
}
