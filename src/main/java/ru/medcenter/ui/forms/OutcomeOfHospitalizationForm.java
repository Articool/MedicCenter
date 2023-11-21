package ru.medcenter.ui.forms;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class OutcomeOfHospitalizationForm implements UIForm {
    public SelenideElement titleHospitalization() {
        return Selenide.$(By.id("iFrame1"));
    }

    public SelenideElement blockOutcome() {
        return Selenide.$(By.name("hospOutcomeId"));
    }

    public SelenideElement blockResultHospitalisation() {
        return Selenide.$(By.name("hospResultId"));
    }

    public SelenideElement blockOutcomeOfTheDisease() {
        return Selenide.$(By.name("clinicalOutcomeId"));
    }

    public SelenideElement blockWorkStatus() {
        return Selenide.$(By.name("workStatusId"));
    }

    public SelenideElement blockTransferredTo() {
        return Selenide.$(By.name("transferredTo"));
    }

    public SelenideElement blockSickList() {
        return Selenide.$(By.name("sickList"));
    }

    public SelenideElement blockMorgue() {
        return Selenide.$(By.name("morgueId"));
    }

    public SelenideElement blockAnotherMorgue() {
        return Selenide.$(By.name("nameOfAnotherMorgue"));
    }

    public SelenideElement fieldOutcome() {
        return Selenide.$(By.id("92")); //выписан-1
    }

    public SelenideElement iFrame() {
        return Selenide.$(By.id("iFrame1"));
    }

    public SelenideElement fieldOutcomeDay() {
        return Selenide.$(By.id("93")); //Выписан в дневной стационар – 2
    }

    public SelenideElement fieldRecovery() {
        return Selenide.$(By.id("96")); //Выздоровление – 1
    }

    public SelenideElement fieldDead() {
        return Selenide.$(By.id("101")); //Умер – 6
    }

    public SelenideElement fieldDischargedWithRecovery() {
        return Selenide.$(By.id("102")); //Выздоровление – 1
    }

    public SelenideElement fieldDeadInTheEmergencyDepartment() {
        return Selenide.$(By.id("107")); //Умер в приемном отделение
    }

    public SelenideElement fieldCompleteRestored() {
        return Selenide.$(By.id("112")); //Восстановлена полностью
    }

    public SelenideElement fieldLost() {
        return Selenide.$(By.id("116")); //Стойко утрачена в связи с другими причинами
    }

    public SelenideElement fieldMorguePresidents() {
        return Selenide.$(By.id("4221")); //Морг при ЦКБ при управ. делами Президента
    }

    public SelenideElement fieldMorgueAnother() {
        return Selenide.$(By.id("4228")); //Морг другое
    }

    public SelenideElement fieldNameMorgueAnother() {
        return Selenide.$(By.name("nameOfAnotherMorgue"));
    }

    public SelenideElement buttonSave() {
        return Selenide.$(By.xpath("//button[@type='submit']"));
    }
}
