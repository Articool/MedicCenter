package ru.medcenter.base_test;

import com.codeborne.selenide.WebDriverRunner;
import com.google.inject.Inject;
import io.qameta.allure.Step;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import ru.medcenter.builders.TestDataBuilder;
import ru.medcenter.ui.steps.LoginSteps;
import ru.medcenter.ui.steps.MainFormSteps;


public abstract class BaseTest {
    @Inject
    protected LoginSteps loginSteps;
    @Inject
    protected MainFormSteps mainFormSteps;

    @BeforeClass
    @Step("Получение драйвера")
    public void initiateDriver() {
        WebDriverRunner.setWebDriver(MainDriver.getDriver());
        WebDriverRunner.getWebDriver().navigate().to("https://omisdev.emcmos.ru/apex/f?p=103");
    }

    @AfterClass
    @Step("Закрытие драйвера")
    public void tearDown() {
        WebDriverRunner.closeWebDriver();
    }

    @AfterMethod
    protected void precondition(){
        //do nothing
    }

}
