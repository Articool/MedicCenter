package ru.medcenter.ui.steps;

import com.codeborne.selenide.conditions.Visible;
import io.qameta.allure.Step;
import ru.medcenter.ui.components.NavigationBar;
import ru.medcenter.ui.forms.EhrRecordsForm;

import static ru.medcenter.enums.TimeoutsEnum.MAJOR;

public class EhrRecordsSteps extends AbstractFormSteps<EhrRecordsForm> implements NavigationBar {

    @Step("Кликаем на кнопку Добавить запись ЭМК")
    public void clickAddRecordButton() {
        form.addRecord().shouldBe(new Visible(), MAJOR.get()).click();
    }

    @Step("Проверяем отображение кнопки Добавить запись ЭМК")
    public void shouldBeAddRecordButton() {
        form.addRecord().shouldBe(new Visible(), MAJOR.get());
    }

    @Step("Кликаем на отсортированную запись ЭМК")
    public void clickSelectedTime(String text) {
        form.fieldTime(text).shouldBe(new Visible(), MAJOR.get()).click();
    }

    @Step("Вводим в поиск данные {text}")
    public void setSearchText(String text) {
        form.fieldSearch().sendKeys(text);
    }

    @Step("Нажимаем на кнопку показать")
    public void clickViewButton() {
        form.buttonView().click();
    }

    @Step("Нажимаем на кнопку Исход госпитализации")
    public void clickOutcomeOfHospitalizationButton() {
        form.fieldOutcomeOfHospitalization().click();
    }
}
