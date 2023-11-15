package ru.medcenter.base_test;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.medcenter.core.DriverManager;


public abstract class BaseTest {

    public static WebDriver driver;

    @BeforeClass
    @Step("Получение драйвера")
    public void initiateDriver() {
        DriverManager.put(MainDriver.getDriver());
        DriverManager.get().navigate().to("https://omisdev.emcmos.ru/apex/f?p=103");
    }

    @AfterClass
    @Step("Закрытие драйвера")
    public void tearDown() {
        DriverManager.tearDown();
    }

}
