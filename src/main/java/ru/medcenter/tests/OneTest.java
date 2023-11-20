package ru.medcenter.tests;

import com.google.inject.Inject;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;
import ru.medcenter.base_test.BaseTest;
import ru.medcenter.base_test.FrameworkModule;
import ru.medcenter.builders.TestDataBuilder;
import ru.medcenter.ui.steps.EhrRecordsSteps;
import ru.medcenter.ui.steps.PatientSteps;

@Guice(modules = {FrameworkModule.class})
public class OneTest extends BaseTest {
    TestDataBuilder testDataBuilder;

    @Inject
    private PatientSteps patientSteps;
    @Inject
    private EhrRecordsSteps ehrRecordsSteps;

    @Override
    @BeforeMethod
    protected void precondition() {
      testDataBuilder = TestDataBuilder.builder()
                .login("ITQTESTFULL2")
                .password("123")
                .searchText("ITQ T.F.")
                .selectedTime("16:35")
                .clientCode("Z00000162")
                .build();
    }

    @Test(description = "as")
    public void oneTest() {
        loginSteps.enterLogin(testDataBuilder);
        loginSteps.enterPassword(testDataBuilder);
        loginSteps.clickEnterButton();
        mainFormSteps.shouldBeRate();
        mainFormSteps.clickButtonPatients();
        patientSteps.shouldBeVisibleButtonSearch();
        patientSteps.setCode(testDataBuilder);

        patientSteps.clickClientWithFieldCode(testDataBuilder);
        ehrRecordsSteps.setSearchText(testDataBuilder);
        ehrRecordsSteps.clickViewButton();
        ehrRecordsSteps.clickSelectedTime(testDataBuilder);
        ehrRecordsSteps.clickOutcomeOfHospitalizationButton();
    }
}
