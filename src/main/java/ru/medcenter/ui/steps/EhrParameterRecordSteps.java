package ru.medcenter.ui.steps;

import com.codeborne.selenide.conditions.Visible;
import io.qameta.allure.Step;
import ru.medcenter.ui.forms.EhrParameterRecordForm;

import static com.codeborne.selenide.Condition.text;
import static ru.medcenter.enums.TimeoutsEnum.MAJOR;

public class EhrParameterRecordSteps extends AbstractFormSteps<EhrParameterRecordForm> {

    @Step("Проверяем что страница Параметры записи ЭМК открылась")
    public void shouldBeOpenRecordTitle() {
        form.titleEhr().shouldBe(new Visible(), MAJOR.get());
    }

    @Step("Вводим запись Эпикриз новорожденного")
    public void setTypeRecord() {
        form.typeRecord().shouldBe(new Visible(), MAJOR.get()).sendKeys("Эпикриз новорожденного");
    }

    @Step("Проверяем что поле тип записи имеет текст Эпикриз новорожденного")
    public void verifyTypeRecordText() {
        form.typeRecord().shouldHave(text("Эпикриз новорожденного"));
    }

    @Step("Нажимаем кнопку Сохранить")
    public void clickButtonSave() {
        form.buttonSave().click();
    }
}
