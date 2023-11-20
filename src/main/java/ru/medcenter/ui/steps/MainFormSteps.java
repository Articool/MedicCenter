package ru.medcenter.ui.steps;

import com.codeborne.selenide.conditions.Visible;
import io.qameta.allure.Step;
import ru.medcenter.ui.components.NavigationBar;
import ru.medcenter.ui.forms.MainForm;

import static ru.medcenter.enums.TimeoutsEnum.MAJOR;

public class MainFormSteps extends AbstractFormSteps<MainForm> implements NavigationBar {
    @Step("Проверяем отображение курса валют")
    public void shouldBeRate() {
        form.rate().shouldBe(new Visible(), MAJOR.get());
    }
}
