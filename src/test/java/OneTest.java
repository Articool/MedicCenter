import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;
import ru.medcenter.base_test.BaseTest;
import ru.medcenter.base_test.FrameworkModule;
import ru.medcenter.ui.steps.EhrRecordsSteps;
import ru.medcenter.ui.steps.PatientSteps;

@Guice(modules = {FrameworkModule.class})
public class OneTest extends BaseTest {

    private final String code = "Z00000162";

    @Inject
    private PatientSteps patientSteps;
    @Inject
    private EhrRecordsSteps ehrRecordsSteps;

    @Test(groups = {""},description = "as")
    public void oneTest(){
        loginSteps.enterLogin();
        loginSteps.enterPassword();
        loginSteps.clickEnterButton();
        mainFormSteps.shouldBeRate();
        mainFormSteps.clickButtonPatients();
        patientSteps.shouldBeVisibleButtonSearch();
        patientSteps.setCode(code);

        patientSteps.clickClientWithFieldCode(code);
        ehrRecordsSteps.setSearchText("ITQ T.F.");
        ehrRecordsSteps.clickViewButton();
        ehrRecordsSteps.clickSelectedTime("16:35");
        ehrRecordsSteps.clickOutcomeOfHospitalizationButton();
    }
}
