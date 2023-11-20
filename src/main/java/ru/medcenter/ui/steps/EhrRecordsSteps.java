package ru.medcenter.ui.steps;

import com.codeborne.selenide.conditions.Visible;
import io.qameta.allure.Step;
import ru.medcenter.builders.TestDataBuilder;
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
    public void clickSelectedTime(TestDataBuilder builder) {
        form.fieldTime(builder.getSelectedTime()).shouldBe(new Visible(), MAJOR.get()).click();
    }

    @Step("Вводим в поисковую строку инициалы пользователя {builder.searchText}")
    public void setSearchText(TestDataBuilder builder) {
        form.fieldSearch().sendKeys(builder.getSearchText());
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
