package ru.medcenter.ui.steps;

import com.codeborne.selenide.conditions.Visible;
import io.qameta.allure.Step;
import ru.medcenter.ui.forms.OutcomeOfHospitalizationForm;

import static com.codeborne.selenide.Selenide.switchTo;
import static ru.medcenter.enums.TimeoutsEnum.MAJOR;

public class OutcomeOfHospitalizationSteps extends AbstractFormSteps<OutcomeOfHospitalizationForm> {

    @Step("Проверяем что страница Исход госпитализации открылась")
    public void shouldBeOpenRecordTitle() {
        form.titleHospitalization().shouldBe(new Visible(), MAJOR.get());
    }

    @Step("Кликаем по полю Исход госпитализации")
    public void clickBlockOutcome() {
        form.blockOutcome().shouldBe(new Visible(), MAJOR.get()).click();
    }

    @Step("Кликаем по полю Выписан-1 из выпадающего списка")
    public void clickFieldDischarged() {
        form.fieldOutcome().shouldBe(new Visible(), MAJOR.get()).click();
    }

    @Step("Переходим в iframe")
    public void changeToFrame() {
        switchTo().frame(form.iFrame());
    }
}
