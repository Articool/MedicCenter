package ru.medcenter.ui.steps;

import com.codeborne.selenide.conditions.Visible;
import io.qameta.allure.Step;
import ru.medcenter.ui.components.NavigationBar;
import ru.medcenter.ui.forms.PatientsForm;

import static ru.medcenter.enums.TimeoutsEnum.MAJOR;

public class PatientSteps extends AbstractFormSteps<PatientsForm> implements NavigationBar {
    @Step("Вводим код клиента")
    public void setCode(String code) {
        form.code().shouldBe(new Visible(), MAJOR.get()).sendKeys(code);
    }

    @Step("Нажимаем на кнопку Поиск")
    public void clickButtonSearch() {
        form.buttonSearch().click();
    }

    @Step("Проверяем отображение кнопки Поиск")
    public void shouldBeVisibleButtonSearch() {
        form.buttonSearch().shouldBe(new Visible(), MAJOR.get());
    }

    @Step("Нажимаем на кнопку Очистить")
    public void clickButtonClear() {
        form.buttonClear().click();
    }

    @Step("Нажимаем на код клиента в блоке Список пациентов")
    public void clickClientWithFieldCode(String code) {
        form.fieldCode(code).click();
    }
}